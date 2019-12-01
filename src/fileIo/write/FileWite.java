package fileIo.write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import common.Common;

/**
 * ファイルの書き込みについての試験クラス<br/>
 */
public class FileWite {

	private boolean isResult;

	/**
	 * FileWriterを使用してファイルの書き込みをしてみる<br/>
	 *
	 * @param outoputList
	 */
	public void useFileWriter(List<String> outputList) {
		try {
			File file = new File(Common.OUTPUT_FOLDER_PATH + "useFileWriter_" + Common.OUTPUT_FILE_NAME_KOKORO);
			FileWriter filewriter = new FileWriter(file, true);
			for (String out : outputList) {
				filewriter.write(out);
				filewriter.write(System.getProperty("line.separator"));
			}
			filewriter.close();
			this.isResult = true;
		} catch (Exception e) {
			System.out.println(e.toString());
			this.isResult = false;
		}
	}

	/**
	 * BufferedWriterを使用してファイルの書き込みをしてみる。<br/>
	 *
	 * @param outputList
	 */
	public void useBufferedWriter(List<String> outputList) {
		try {
			File file = new File(Common.OUTPUT_FOLDER_PATH + "useBufferedWriter_" + Common.OUTPUT_FILE_NAME_KOKORO);
			FileWriter filewriter = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(filewriter);
			for (String out : outputList) {
				bw.write(out);
				bw.write(System.getProperty("line.separator"));
			}
			bw.close();
			this.isResult = true;
		} catch (Exception e) {
			System.out.println(e.toString());
			this.isResult = false;
		}
	}

	/**
	 * PrintWriterを使用してファイルの書き込みをしてみる。<br/>
	 *
	 * @param outputList
	 */
	public void usePrintWriter(List<String> outputList) {
		try {
			File file = new File(Common.OUTPUT_FOLDER_PATH + "usePrintWriter_" + Common.OUTPUT_FILE_NAME_KOKORO);
			FileWriter filewriter = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(filewriter);
			PrintWriter pw = new PrintWriter(bw);
			for (String out : outputList) {
				pw.println(out);
			}
			pw.close();
			this.isResult = true;
		} catch (Exception e) {
			System.out.println(e.toString());
			this.isResult = false;
		}
	}

	public boolean isResult() {
		return isResult;
	}

	public void setResult(boolean isResult) {
		this.isResult = isResult;
	}
}