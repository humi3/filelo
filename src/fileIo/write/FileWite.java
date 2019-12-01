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

	/**
	 * FileWriterを使用してファイルの書き込みをしてみる<br/>
	 * 
	 * @param outoputList
	 */
	public void useFileWriter(List<String> outputList) {
		try {
			File file = new File("useFileWriter_" + Common.OUTPUT_FOLDER_PATH + Common.OUTPUT_FILE_NAME_KOKORO);
			FileWriter filewriter = new FileWriter(file);
			for (String out : outputList) {
				filewriter.write(out);
			}
			filewriter.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	/**
	 * BufferedWriterを使用してファイルの書き込みをしてみる。<br/>
	 * 
	 * @param outputList
	 */
	public void useBufferedWriter(List<String> outputList) {
		try {
			File file = new File("useBufferedWriter_" + Common.OUTPUT_FOLDER_PATH + Common.OUTPUT_FILE_NAME_KOKORO);
			FileWriter filewriter = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(filewriter);
			for (String out : outputList) {
				bw.write(out);
			}
			bw.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	/**
	 * PrintWriterを使用してファイルの書き込みをしてみる。<br/>
	 * 
	 * @param outputList
	 */
	public void usePrintWriter(List<String> outputList) {
		try {
			File file = new File("usePrintWriter_" + Common.OUTPUT_FOLDER_PATH + Common.OUTPUT_FILE_NAME_KOKORO);
			FileWriter filewriter = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(filewriter);
			PrintWriter pw = new PrintWriter(bw);
			for (String out : outputList) {
				pw.println(out);
			}
			pw.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}