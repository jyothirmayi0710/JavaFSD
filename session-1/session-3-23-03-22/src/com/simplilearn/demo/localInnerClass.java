package com.simplilearn.demo;

public class localInnerClass {
	void validate(int age) {
		if(age>=18) {
			class Inner{
				void test() {
					System.out.println("now authenticate user");		
				}
			}
			Inner inner=new Inner();
			inner.test();	
		}
		else {
			System.out.println("no need");
		}
		}
	public static void main(String[] args) {
		localInnerClass local=new localInnerClass();
		local.validate(8);
	}
}
