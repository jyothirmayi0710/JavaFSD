package com.simplilearn.demo;

public class methodLocalInnerClasss {
	public void display() {
		class Inner{
			void myMethod() {
				System.out.println(" method for inner class");
			}
		}
		Inner inner=new Inner();
		inner.myMethod();
	}
public static void main(String[] args) {
	
	methodLocalInnerClasss mlc=new methodLocalInnerClasss();
	mlc.display();
}
}
