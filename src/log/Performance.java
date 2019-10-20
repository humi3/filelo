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

	static final String LOG_PATH = System.getProperty("user.dir") + File.separator + "log" + File.separator
			+ "performance.log";

	private Map<String, Long> log;

	public Performance() {
		super();
		this.log = new HashMap<String, Long>();
	}

	/**
	 * 開始時刻を記録します。
	 * @param key String nullは許容しない
	 */
	public void start(String key) {
		if (StringUtils.isEmpty(key)) {
			return;
		}
		this.log.put(key, System.currentTimeMillis());
	}

	/**
	 * 終了時刻をlogファイルに記録します。
	 * @param key nullは許容しない
	 */
	public void end(String key) {
		if (!this.log.containsKey(key) || StringUtils.isEmpty(key)) {
			return;
		}
		long endTime = System.currentTimeMillis();
		long performanceTime = endTime - this.log.get(key);
		writeLog(key, performanceTime);
	}

	/**
	 * ログを外部ファイルに出力
	 * @param key
	 * @param performanceTime
	 */
	private void writeLog(String key, long performanceTime) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(LOG_PATH, true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);

			pw.write(key + "処理時間: " + performanceTime + "ms");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			pw.close();
		}
	}
}
