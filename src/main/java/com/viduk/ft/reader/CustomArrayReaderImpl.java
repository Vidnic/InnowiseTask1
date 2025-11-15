package com.viduk.ft.reader;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.IOException;
import java.nio.file.*;

import com.viduk.ft.exсeption.CustomArrayException;

public class CustomArrayReaderImpl implements CustomArrayReader {

	public List<String> customArrayReader(String filepath) throws CustomArrayException {
		
		List<String> readedFile = new ArrayList<>();
		Path path = Paths.get("data.txt");
		if(!Files.exists(path)) {
			throw new CustomArrayException("File does not exsists");
		}
		try{
			if(Files.size(path) == 0)
				throw new CustomArrayException("File is empty");
			readedFile = Files.readAllLines(path);
		}
		catch(IOException e) {
			throw new CustomArrayException("File error");
		}
		return readedFile;
		
	}
	
}
