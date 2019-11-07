package fileIo;

import fileIo.read.FilesRead;
import log.Performance;

public class Main {

	public static void main(String[] args) {

		Performance log = new Performance();

		FilesRead readTest = new FilesRead();

		/* 開始時間を記録 */
		log.writeTime();

		/* readString */
		log.start("readString");
		readTest.readString();
		log.stop();

		/* readAllLines */
		log.start("readAllLines");
		readTest.readAllLines();
		log.stop();

		/* readAllBytes */
		log.start("readAllBytes");
		readTest.readAllBytes();
		log.stop();

		/* lines */
		log.start("lines");
		readTest.lines();
		log.stop();
	}

}
