package com.simplilearn.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex4 {
	public static void main(String[] args) {
		String pattern="[a-z]+";
		Pattern p=Pattern.compile(pattern);
		String check="Regular expression";
		Matcher match= p.matcher(check);
		while(match.find()) {
			System.out.println(check.substring(match.start(),match.end()));
		}
	}
}
