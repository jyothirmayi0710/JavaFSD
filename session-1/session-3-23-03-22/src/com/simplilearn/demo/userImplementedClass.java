package com.simplilearn.demo;

public class userImplementedClass {
	public static void main(String[] args) {
		/*create multiple objects of car 
		  and use same method which is implenmted 
		  in another */
		Hundai hundai=new Hundai();
		hundai.start();
		hundai.stop();
		
		Suzuki suzuki=new Suzuki();
		suzuki.start();
		suzuki.stop();
	}

}
