package com.simplilearn.demo;

import java.util.Scanner;

public class singleArray {
	public static void main(String[] args) {
		int arr[]= {11,12,13,14,15,16};
		System.out.println("element:"+arr[2]);
		System.out.println("length of array"+arr.length);
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//another way of declaration
		int a[]=new int[5];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter value");
			a[i]=sc.nextInt();
		}
		//print scanned element
	for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
		
		}



}