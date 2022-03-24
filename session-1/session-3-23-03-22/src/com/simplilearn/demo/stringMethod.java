package com.simplilearn.demo;



public class stringMethod {
public static void main(String[] args) {
	String s=new String("hello world");
	System.out.println("length "+s.length());
	System.out.println("character at index5 "+s.charAt(5));
	System.out.println(s.startsWith("Hello"));
	System.out.println();
	String str="      Hello     ";
	System.out.println(str.length());
	System.out.println(str.stripLeading().length());//remove white space before string
	System.out.println(str.stripTrailing().length());//remove white space after string
	System.out.println(str.trim().length());//remove white space in a string
}
}
