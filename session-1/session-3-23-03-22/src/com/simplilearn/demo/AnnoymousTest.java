package com.simplilearn.demo;

public class AnnoymousTest {
	//Anonymous  inner class
	public static void main(String[] args) {
		Car c=new Car() {
			@Override
			public void start() {
				// TODO Auto-generated method stub
		System.out.println("car start");
			}
			@Override
			public void stop() {
				System.out.println("car stop");
			}
			
		};
		c.start();
		c.stop();
	}
	}
