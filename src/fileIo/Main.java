package fileIo;

import fileIo.read.FileRead;
import log.Performance;

public class Main {

	public static void main(String[] args) {

		Performance log = new Performance();

		FileRead readTest = new FileRead();
		log.start("readString");
		readTest.readString();
		log.stop();
	}

}
