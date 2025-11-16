package com.viduk.ft.parser;

import java.util.List;

public interface CustomArrayParser {
	
	final String CUSTOM_ARRAY_DELIMITERS = "[,.;\\s]+";
	
	List<String[]> parseCustomArrayStringList(List<String> stringList);

}
