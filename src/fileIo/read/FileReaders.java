package fileIo.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import common.Common;

/**
 * ファイルの読み込みをまとめたクラス
 */
public class FileReaders {

	private boolean isResult;

	/**
	 * ファイルの読み込みの計測のため、system.outしないß
	 */
	public void useFileReader() {
		File file = this.getKokoroFile();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text;
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}
			this.isResult = true;
		} catch (IOException e) {
			e.printStackTrace();
			this.isResult = false;
		}
	}

	/**
	 * @return fileName file
	 */
	private File getFile(String fileName) {
		return new File(Common.INPUT_FOLDER_PATH + fileName);
	}

	private File getKokoroFile() {
		return this.getFile(Common.INPUT_FILE_NAME_KOKORO);
	}

	public boolean isResult() {
		return isResult;
	}

	public void setResult(boolean isResult) {
		this.isResult = isResult;
	}
}