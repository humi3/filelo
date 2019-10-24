package log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

/**
 * 実行速度を測るクラス
 * @author bunnk
 */
public class Performance {

	private static final String LOG_PATH = System.getProperty("user.dir") + File.separator + "log" + File.separator
			+ "performance.log";

	private static final String LOG_TEXT = "%key 処理時間:  %performanceTime ms";
	private static final String REPLACE_WORD_KEY = "%key";
	private static final String REPLACE_WORD_PERFORMANCE_TIME = "%performanceTime";

	private Map<String, Long> log;

	/* 1つ前のkey */
	private String previousKey;

	public Performance() {
		super();
		this.log = new HashMap<String, Long>();
	}

	/**
	 * 開始時刻を記録します。<br>
	 * @param key String nullは許容しない
	 */
	public void start(String key) {
		if (StringUtils.isEmpty(key)) {
			return;
		}
		this.previousKey = key;
		this.log.put(key, System.currentTimeMillis());
	}

	/**
	 * 1つ前のkeyを使用してlogを記録する<br>
	 * log記録後使用したkeyを削除する。<br>
	 * nullの場合は、何もしない
	 */
	public void stop() {
		if (StringUtils.isNotEmpty(this.previousKey)) {
			this.stop(this.previousKey);
			this.previousKey = null;
		}
	}

	/**
	 * 終了時刻をlogファイルに記録します。<br>
	 * logファイルに出力後keyの内容を削除します。<br>
	 * @param key nullは許容しない
	 */
	public void stop(String key) {
		if (!this.log.containsKey(key) || StringUtils.isEmpty(key)) {
			return;
		}
		long endTime = System.currentTimeMillis();
		long performanceTime = endTime - this.log.get(key);

		String logText = LOG_TEXT;
		logText = logText.replace(REPLACE_WORD_KEY, key);
		logText = logText.replace(REPLACE_WORD_PERFORMANCE_TIME, Long.toString(performanceTime));

		writeLog(logText);
		this.log.remove(key);
	}

	/**
	 * ログを外部ファイルに出力<br>
	 * @param logText
	 */
	private void writeLog(String logText) {
		if (StringUtils.isEmpty(logText))
			return;

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(LOG_PATH, true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);

			pw.write(logText);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			pw.close();
		}
	}
}
