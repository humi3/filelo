package fileIo.read;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import fileIo.FileCommon;

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
	 * 以下本家doclet<br>
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
		Path file = Paths.get(FileCommon.INPUT_FOLDER_PATH + FileCommon.INPUT_FILE_NAME_KOKORO);
		try {
			String text = Files.readString(file, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}