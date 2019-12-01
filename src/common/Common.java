package common;

import java.io.File;

/**
 * fileioで共通する定義をまとめたクラス。 名前はあまりよろしくないが今回は動作確認程度なので良し。
 * 
 * @author bunnk
 *
 */
public final class Common {

	/* DateFormat yyyy-MM-dd HH:mm */
	public final static String DATE_FORMAT = "yyyy-MM-dd HH:mm";

	/* インプットファイル名 こころ 著者：夏目漱石 保存形式 utf-8 */
	public final static String INPUT_FILE_NAME_KOKORO = "kokoro.txt";

	/* インプットファイル名 こころ 著者：夏目漱石 保存形式 utf-8 */
	public final static String OUTPUT_FILE_NAME_KOKORO = "output_kokoro.txt";

	/* inputのフォルダパス */
	public final static String INPUT_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "file"
			+ File.separator + "input" + File.separator;

	/* outputのフォルダパス */
	public final static String OUTPUT_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "file"
			+ File.separator + "output" + File.separator;

	/* logのファイルパス */
	public static final String LOG_PATH = System.getProperty("user.dir") + File.separator + "log" + File.separator
			+ "performance.log";
}
