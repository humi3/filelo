package log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import common.Common;

/**
 * 実行速度を測るクラス
 * @author bunnk
 */
public class Performance {

	private static final String LOG_TEXT = "%key 処理時間:  %performanceTime ms";
	private static final String REPLACE_WORD_KEY = "%key";
	private static final String REPLACE_WORD_PERFORMANCE_TIME = "%performanceTime";

	private Map<String, Long> logPointMap;

	/* 1つ前のkey */
	private String previousKey;

	public Performance() {
		super();
		this.logPointMap = new HashMap<String, Long>();
	}

	/**
	 * 現在時刻をログファイルに記録します。
	 */
	public void writeTime() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat(Common.DATE_FORMAT);
		String formattedDate = dateFormat.format(date);
		Log.writeLog(formattedDate);
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
		this.logPointMap.put(key, System.currentTimeMillis());
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
		if (!this.logPointMap.containsKey(key) || StringUtils.isEmpty(key)) {
			return;
		}
		long endTime = System.currentTimeMillis();
		long performanceTime = endTime - this.logPointMap.get(key);

		String logText = LOG_TEXT;
		logText = logText.replace(REPLACE_WORD_KEY, key);
		logText = logText.replace(REPLACE_WORD_PERFORMANCE_TIME, Long.toString(performanceTime));

		Log.writeLog(logText);
		this.logPointMap.remove(key);
	}
}
