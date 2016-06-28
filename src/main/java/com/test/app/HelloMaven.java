package com.test.app;

import org.apache.commons.lang3.StringUtils;

public class HelloMaven {
	public static String text = "hi";
	
	public static void main(String[] args) {
		
		if(StringUtils.isNotEmpty(text)){
			System.out.println("done");
		}
	}

}
