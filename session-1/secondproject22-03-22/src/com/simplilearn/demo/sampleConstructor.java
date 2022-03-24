package com.simplilearn.demo;

public class sampleConstructor {
	int id;
	String name;
	public sampleConstructor() {
		id=23;
		name="jyothi";
	}
	public sampleConstructor(int id, String name) {
		
	}
public static void main(String[] args) {
	sampleConstructor obj=new sampleConstructor();
	System.out.println("Id:"+obj.id);
	System.out.println("Name:"+obj.name);
			
}
}
