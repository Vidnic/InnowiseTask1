package com.viduk.ft.validator.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CustomArrayValidatorImplTest {
	
	CustomArrayValidatorImpl validator = new CustomArrayValidatorImpl();
  @Test
  void isValidFalseTest() {
  	String[] testData = {
  	    "123",      
  	    "-456",     
  	    "0",        
  	    "007",      
  	    "abc",      
  	    "12a",      
  	    "--12",     
  	    "",       
  	    " ",        
  	    "+789",     
  	    "-0",       
  	    "999999999" 
  	};	
  	boolean expected = false;
  	boolean actual = validator.checkCustomArrayString(testData);
    assertEquals(expected, actual);
  }
  @Test
  void isValidTrueTest() {
  	String[] testData = {
  	    "123",      
  	    "-456",     
  	    "0",        
  	    "7",           
  	    "-12",     
  	    "666",       
  	    "3",        
  	    "789",     
  	    "-05",       
  	    "999999999" 
  	};
  	boolean expected = true;
  	boolean actual = validator.checkCustomArrayString(testData);
    assertEquals(expected, actual);
  }
}
