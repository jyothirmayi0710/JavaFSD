package com.simplilearn.demo;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st value");
		int num=sc.nextInt();
		do {
			System.out.println(num);
			num++;
		}
		while(num<5);
		
	}

}
