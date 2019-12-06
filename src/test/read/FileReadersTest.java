package test.read;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import fileIo.read.FileReaders;

/**
 * FileReadersのテストクラス<br/>
 * <br/>
 * 主に計測が目的
 * @author bunnk
 *
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FileReadersTest {

	private FileReaders fr;

	@BeforeEach
	void init() {
		this.fr = new FileReaders();
	}

	@Test
	void useFileReaderTest() {
		this.fr.useFileReader();
		assertTrue(this.fr.isResult());
	}
}