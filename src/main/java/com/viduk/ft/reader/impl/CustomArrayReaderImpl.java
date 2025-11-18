package com.viduk.ft.reader.impl;

import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.*;

import com.viduk.ft.exсeption.CustomArrayException;
import com.viduk.ft.reader.CustomArrayFileReader;

public class CustomArrayReaderImpl implements CustomArrayFileReader {

	private static final Logger log = LogManager.getLogger();
	
	public List<String> readCustomArrayFile(String filepath) throws CustomArrayException {
		
		List<String> readedFile;
		Path path = Paths.get(filepath);
		if(!Files.exists(path)) {
			log.log(Level.ERROR, "input File doesn't exist");
			throw new CustomArrayException("File does not exsists" + filepath);
		}
		try{
			readedFile = Files.readAllLines(path);
		}
		catch(IOException e) {
			log.log(Level.ERROR, "input File error");
			throw new CustomArrayException("File error" + e);
		}
		log.log(Level.INFO, "File successfully readed");
		return readedFile;
		
	}
	
}
