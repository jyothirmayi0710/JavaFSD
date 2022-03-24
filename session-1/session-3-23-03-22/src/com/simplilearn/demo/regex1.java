package com.simplilearn.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1 {
	public static void main(String[] args) {
		
		String pattern="[a-zA-Z]aat";
		Pattern p=Pattern.compile(pattern);
		Matcher match=p.matcher("baat");
		System.out.println("result: "+match.matches());
	}

}
