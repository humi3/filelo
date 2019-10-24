package fileIo;

import java.io.File;

/**
 * fileioで共通する定義をまとめたクラス。
 * 名前はあまりよろしくないが今回は動作確認程度なので良し。
 * @author bunnk
 *
 */
public final class FileCommon {

	/* インプットファイル名 こころ 著者：夏目漱石 保存形式 utf-8 */
	public final static String INPUT_FILE_NAME_KOKORO = "kokoro.txt";

	/* inputのフォルダパス */
	public final static String INPUT_FOLDER_PATH = System.getProperty("user.dir") + File.separator
			+ "file" + File.separator + "input" + File.separator;

	/* outputのフォルダパス */
	public final static String OUTPUT_FOLDER_PATH = System.getProperty("user.dir") + File.separator
			+ "file" + File.separator + "output" + File.separator;
}
