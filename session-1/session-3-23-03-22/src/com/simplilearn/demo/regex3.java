package com.simplilearn.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex3 {
	public static void main(String[] args) {
		String pattern="[a-zA-Z]{6}";
		Pattern p=Pattern.compile(pattern);
		Matcher match=p.matcher("jyothirmayi");
		System.out.println("result: "+match.matches());
		
		String pattern1="[789]{1}\\d{9}";
		Pattern p1=Pattern.compile(pattern1);
		Matcher match1=p1.matcher("854561235");
		if(match1.matches()) {
			System.out.println("mobile number is valid");
		}
		else {
			System.out.println("invalid");
		}
	}
}
