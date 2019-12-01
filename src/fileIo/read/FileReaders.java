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
		} catch (IOException e) {
			e.printStackTrace();
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
}