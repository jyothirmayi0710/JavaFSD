package com.simplilearn.demo;

import java.util.Scanner;

public class whileExample {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value");
		int num=sc.nextInt();
		while(num<10) {
			System.out.println(num);
			num++;
		}
	}

}
