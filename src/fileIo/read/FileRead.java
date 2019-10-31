package fileIo.read;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import common.Common;

/**
 * 各ファイルの読み込みをまとめたクラス
 * @author bunnk
 */
public class FileRead {

	/**
	 * readString<br>
	 * 1度にすべてのテキストを読み込む<br>
	 * OutOfMemoryError に注意<br>
	 * java 11以降使用可能<br>
	 * 以下本家docs<br>
	 *<br>
	 * param   path the path to the file<br>
	 * param   cs the charset to use for decoding<br>
	 *<br>
	 * return  a String containing the content read from the file<br>
	 *<br>
	 * throws  IOException<br>
	 * throws  OutOfMemoryError<br>
	 * throws  SecurityException<br>
	 */
	public void readString() {
		try {
			@SuppressWarnings("unused")
			String text = Files.readString(getKokoroPath(), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * readAllLines<br>
	 * テキストを一行づつStringの形式で読み込む<br>
	 * java 7以降使用可能<br>
	 * 以下本家docs<br>
	 * <br>
	 * param   path<br>
	 *          the path to the file<br>
	 * param   cs<br>
	 *          the charset to use for decoding<br>
	 *<br>
	 * return  the lines from the file as a {@code List}; whether the {@code<br>
	 *          List} is modifiable or not is implementation dependent and<br>
	 *          therefore not specified<br>
	 *<br>
	 * throws  IOException <br>
	 * throws  SecurityException<br>
	 *
	 */
	public void readAllLines() {
		try {
			@SuppressWarnings("unused")
			List<String> texts = Files.readAllLines(getKokoroPath(), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * readAllBytes<br>
	 * テキストをbyte配列の形式で読み込む<br>
	 * OutOfMemoryError に注意<br>
	 * java 7以降使用可能<br>
	 * 以下本家docs<br>
	 * <br>
	 * param   path<br>
	 *          the path to the file<br>
	 * <br>
	 * return  a byte array containing the bytes read from the file<br>
	 * <br>
	 * throws  IOException<br>
	 * throws  OutOfMemoryError<br>
	 * throws  SecurityException<br>
	 *
	 */
	public void readAllBytes() {
		try {
			@SuppressWarnings("unused")
			byte[] bytes = Files.readAllBytes(getKokoroPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * lines<br>
	 * Files.linesを使用し、ファイルの各行を持つStreamを作成する。<br>
	 * java 8以降使用可能
	 */
	public void lines() {
		Path file = getKokoroPath();
		try {
			Files.lines(file).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return kokoro path
	 */
	private Path getKokoroPath() {
		return Paths.get(Common.INPUT_FOLDER_PATH + Common.INPUT_FILE_NAME_KOKORO);
	}

}