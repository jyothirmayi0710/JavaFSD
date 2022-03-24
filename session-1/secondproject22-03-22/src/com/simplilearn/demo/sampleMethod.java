package com.simplilearn.demo;

public class sampleMethod {
	
	public float temp(float celsius) {
		return (((celsius*9)/5)+32);
	}
	public static void main(String[] args) {
		sampleMethod s=new sampleMethod();
		System.out.println("Farenheat "+s.temp(20));
	}
}
