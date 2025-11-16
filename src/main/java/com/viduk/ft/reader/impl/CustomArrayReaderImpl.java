package com.viduk.ft.reader.impl;

import java.util.List;
import java.io.IOException;
import java.nio.file.*;

import com.viduk.ft.exсeption.CustomArrayException;
import com.viduk.ft.reader.CustomArrayReader;

public class CustomArrayReaderImpl implements CustomArrayReader {

	public List<String> readCustomArrayFile(String filepath) throws CustomArrayException {
		
		List<String> readedFile;
		Path path = Paths.get(filepath);
		if(!Files.exists(path)) {
			throw new CustomArrayException("File does not exsists" + filepath);
		}
		try{
			readedFile = Files.readAllLines(path);
		}
		catch(IOException e) {
			throw new CustomArrayException("File error" + e);
		}
		return readedFile;
		
	}
	
}
