package com.simplilearn.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {
	public static void main(String[] args) {
		String pattern="[a-zA-Z0-9]*";
		Pattern p=Pattern.compile(pattern);
		Matcher match=p.matcher("jyothi071");
		System.out.println("result: "+match.matches());
		
		
	}

}
