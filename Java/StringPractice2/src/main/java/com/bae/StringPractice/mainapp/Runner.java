package com.bae.StringPractice.mainapp;

import org.apache.commons.lang3.text.WordUtils;

public class Runner {
	
	public static void main(String[] args) {
		
		String test = "this is a sentence";
		
		System.out.println(convertToTileCaseWordUtilsFull(test));
		
		
		
	}
	
	public static String convertToTileCaseWordUtilsFull(String text) {
	    return WordUtils.capitalizeFully(text);
	}

}
