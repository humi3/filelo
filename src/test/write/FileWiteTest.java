package test.write;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import common.Common;
import fileIo.write.FileWite;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FileWiteTest {

	private FileWite fw;
	private List<String> outputList;

	@BeforeAll
	void init() {
		this.fw = new FileWite();
		this.outputList = getOutputList();
		deletOutputFolderFiles();
	}

	@BeforeEach
	void beforeEach() {
		this.fw.setResult(false);
	}

	@Test
	void useFileWriterTest() {
		this.fw.useFileWriter(this.outputList);
		assertTrue(this.fw.isResult());
	}

	@Test
	void useBufferedWriterTest() {
		this.fw.useBufferedWriter(this.outputList);
		assertTrue(this.fw.isResult());
	}

	@Test
	void usePrintWriterTest() {
		this.fw.usePrintWriter(this.outputList);
		assertTrue(this.fw.isResult());
	}

	/**
	 * getOutputList<br/>
	 * <br/>
	 * 心の全文を返します。
	 * @return
	 */
	private List<String> getOutputList() {
		List<String> outputList = new ArrayList<String>();
		File file = new File(Common.INPUT_FOLDER_PATH + Common.INPUT_FILE_NAME_KOKORO);
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text;
			while ((text = br.readLine()) != null) {
				outputList.add(text);
			}
		} catch (IOException e) {
			e.printStackTrace();
			outputList = new ArrayList<String>();
		}
		return outputList;
	}

	/**
	 * outputフォルダ内のファイルを削除します<br/>
	 * <br/>
	 * outputのフォルダには、txtファイルのみ置かれる仕様なのでフォルダは考慮しない。
	 */
	private void deletOutputFolderFiles() {
		File outputPath = new File(Common.OUTPUT_FOLDER_PATH);
		String[] paths = outputPath.list();
		for (String path : paths) {
			File f = new File(Common.OUTPUT_FOLDER_PATH + File.separator + path);
			if (!f.isDirectory()) {
				f.delete();
			}
		}
	}
}
