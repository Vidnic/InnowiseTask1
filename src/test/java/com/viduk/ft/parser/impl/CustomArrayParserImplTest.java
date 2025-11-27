package com.viduk.ft.parser.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.viduk.ft.parser.CustomArrayParser;

class CustomArrayParserImplTest {

    private final CustomArrayParser parser = new CustomArrayParserImpl();

    @Test
    void testParseCustomArrayStringList_basicCase() {
        List<String> input = Arrays.asList("1,2,3", "4,5,6");
        List<String[]> result = parser.parseCustomArrayStringList(input);
        assertEquals(2, result.size());
        assertArrayEquals(new String[]{"1", "2", "3"}, result.get(0));
        assertArrayEquals(new String[]{"4", "5", "6"}, result.get(1));
    }

    @Test
    void testParseCustomArrayStringList_emptyList() {
        List<String> input = List.of();
        List<String[]> result = parser.parseCustomArrayStringList(input);
        assertTrue(result.isEmpty());
    }

    @Test
    void testParseCustomArrayStringList_withDifferentDelimiters() {
        List<String> input = Arrays.asList("a;b;c", "d e f", "g,h,i");
        List<String[]> result = parser.parseCustomArrayStringList(input);
        assertEquals(3, result.size());
        assertArrayEquals(new String[]{"a", "b", "c"}, result.get(0));
        assertArrayEquals(new String[]{"d", "e", "f"}, result.get(1));
        assertArrayEquals(new String[]{"g", "h", "i"}, result.get(2));
    }
}