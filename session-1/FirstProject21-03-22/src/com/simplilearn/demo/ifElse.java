package com.simplilearn.demo;
import java.util.Scanner;
public class ifElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value");
		int num1=sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter 2st value");
		int num2=sc1.nextInt();
		if(num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		}
		else {
			System.out.println(num1+" is lesser than "+num2);
		}
	}

}
