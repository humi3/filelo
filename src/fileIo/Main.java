package fileIo;

public class Main {

	private final static String INPUT_FILE_FOLDER_DIR =  System.getProperty("user.dir") + "\\file\\input\\";
	private final static String OUTPUT_FILE_FOLDER_DIR =  System.getProperty("user.dir") + "\\file\\output\\";
	
	private final static String TEST_FILE_NAME = "test.txt";

	public static void main(String[] args) {
		 String dir = System.getProperty("user.dir");
		 System.out.println("Projectのトップレベルのパス： " + dir);
		 System.out.println(INPUT_FILE_FOLDER_DIR);
		 System.out.println(OUTPUT_FILE_FOLDER_DIR);
	}

}
