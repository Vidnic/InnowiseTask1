package com.viduk.ft.reader;

import java.util.List;

import com.viduk.ft.exсeption.CustomArrayException;

public interface CustomArrayReader {
	
	 List<String> readCustomArrayFile(String filepath) throws CustomArrayException;

}
