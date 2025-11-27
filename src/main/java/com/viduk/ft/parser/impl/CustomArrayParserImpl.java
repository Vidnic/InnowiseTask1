package com.viduk.ft.parser.impl;

import java.util.List;
import java.util.stream.*;

import com.viduk.ft.parser.CustomArrayParser;

public class CustomArrayParserImpl implements CustomArrayParser {

	@Override
	public List<String[]> parseCustomArrayStringList(List<String> stringList) {
		List<String[]> parsedLines = stringList.stream()
				.map(line -> line.split(CUSTOM_ARRAY_DELIMITERS))
				.collect(Collectors.toList());
		return parsedLines;
	}

}