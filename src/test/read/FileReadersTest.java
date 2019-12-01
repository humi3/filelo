package test.read;

import static org.junit.jupiter.api.Assertions.assertEquals;

import fileIo.read.FileReaders;

public class FileReadersTest(){

	private FileReaders testFrs;

	@Test
	void useFileReaderTest(){
		assertEquals("XYZ", "xyz".toUpperCase());
	}
}