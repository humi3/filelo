package test.read;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import fileIo.read.FilesRead;

/**
 * FilesReadのテストクラス<br/>
 * <br/>
 * 主に計測
 * @author bunnk
 *
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FilesReadTest {

	private FilesRead fr;

	@BeforeEach
	void init() {
		System.out.println("test");
		this.fr = new FilesRead();
	}

	@Test
	void readStringTest() {
		this.fr.readString();
		assertTrue(fr.isResult());
	}

	@Test
	void readAllLinesTest() {
		this.fr.readAllLines();
		assertTrue(fr.isResult());
	}

	@Test
	void readAllBytesTest() {
		this.fr.readAllBytes();
		assertTrue(fr.isResult());
	}

	@Test
	void linesTest() {
		this.fr.lines();
		assertTrue(fr.isResult());
	}
}
