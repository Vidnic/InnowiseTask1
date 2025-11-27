package com.viduk.ft.reader.impl;

import org.junit.jupiter.api.*;

import com.viduk.ft.exсeption.CustomArrayException;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayReaderImplTest {
	@Test
	void readCustomArrayFile_success() {
		List<String> expected;
		expected = new ArrayList<>(Arrays.asList("1; 2; 3", "4, 5, 6", "7 8 9", "10 - 11 - 12", "", "13  14  15",
				"16; 17, 18", "19 - x20 - 21", "22 23 24", "25; 26..27; 28"));
		CustomArrayReaderImpl reader = new CustomArrayReaderImpl();
		try {
			List<String> actual = reader.readCustomArrayFile("data/data.txt");
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void readCustomArrayFileFileNotExists() {
		CustomArrayReaderImpl reader = new CustomArrayReaderImpl();
		assertThrows(CustomArrayException.class, () -> reader.readCustomArrayFile("data/nonExisting.txt"));
	}

	@Test
	void readCustomArrayFileEmptyFile() throws Exception {
		Path tempFile = Files.createTempFile("empty", ".txt");
		CustomArrayReaderImpl reader = new CustomArrayReaderImpl();
		List<String> actual = reader.readCustomArrayFile(tempFile.toString());
		assertTrue(actual.isEmpty());
		Files.deleteIfExists(tempFile);
	}
}
