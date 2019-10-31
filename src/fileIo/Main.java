package fileIo;

import fileIo.read.FileRead;
import log.Performance;

public class Main {

	public static void main(String[] args) {

		Performance log = new Performance();

		FileRead readTest = new FileRead();

		/*開始時間を記録 */
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
