package com.simplilearn.demo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateEmail {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("wipro@gmail.com");
		list.add("jyothi@gmail.com");
		list.add("harika@gmail.com");
		list.add("jyothi123@gmail.com");
		list.add("sravya@gmail.com");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value");
		String a=sc.next();
		String regex = "^(.+)@(.+)$";
		 
		Matcher matcher = Pattern.compile(regex).matcher(a);
		 
		if(matcher.matches()&&list.stream().anyMatch(mail->mail.equals(a))) {
			System.out.println(a+" is present");
		}
		else {
			System.out.println(a+" is not present");
		}
	     
		
	}

}
