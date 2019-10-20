package fileIo;

import java.io.File;

import log.Performance;

public class Main {

	private final static String INPUT_FOLDER_PATH = System.getProperty("user.dir") + File.separator
			+ "file" + File.separator + "input" + File.separator;
	private final static String OUTPUT_FOLDER_PATH = System.getProperty("user.dir") + File.separator
			+ "file" + File.separator + "output" + File.separator;

	private final static String TEST_FILE_NAME = "test.txt";

	public static void main(String[] args) {

		Performance log = new Performance();
		log.start("test");
		String dir = System.getProperty("user.dir");
		System.out.println("Projectのトップレベルのパス： " + dir);
		System.out.println(INPUT_FOLDER_PATH);
		System.out.println(OUTPUT_FOLDER_PATH);
		log.end("test");
	}

}
