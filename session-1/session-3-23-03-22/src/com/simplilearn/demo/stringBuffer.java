package com.simplilearn.demo;

public class stringBuffer {
	public static void main(String[] args) {
		System.out.println("STRING BUFFER");
		StringBuffer str =new StringBuffer("Hello World");;
		System.out.println("character at index 4 "+str.charAt(4));
		System.out.println("length of string "+str.length());
		System.out.println("replace "+str.replace(0, 5, "welcome"));
		System.out.println("reversr "+str.reverse());
		System.out.println("length of string "+str.length());
		System.out.println();
	//create string builder
		System.out.println("STRING BUILDER");
		String s="sambangi jyothirmayi";
		StringBuilder str1 =new StringBuilder(s);
		System.out.println("character at index 4 "+str1.charAt(4));
		System.out.println("length of string "+str1.length());
		System.out.println("replace "+str1.replace(0, 8, "s"));
		System.out.println("reversr "+str1.reverse());
		System.out.println("length of string "+str1.length());
}
}