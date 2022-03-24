package com.simplilearn.demo;

public class regularInnerClass {
	class Inner{
		void display()
		{
			System.out.println("welcome to inner class");
		}
	}
	
	public static void main(String[] args) {
		regularInnerClass obj=new regularInnerClass();
		regularInnerClass.Inner inner= obj.new Inner();
		inner.display();
	}

}
