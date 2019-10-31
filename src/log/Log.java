package log;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.lang3.StringUtils;

import common.Common;

public class Log {

	/**
	 * ログを外部ファイルに出力<br>
	 * @param logText
	 */
	public static void writeLog(String logText) {
		if (StringUtils.isEmpty(logText))
			return;

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(Common.LOG_PATH, true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);

			pw.write(logText);
			pw.write(System.getProperty("line.separator"));
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			pw.close();
		}
	}
}
