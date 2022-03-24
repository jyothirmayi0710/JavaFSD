package com.simplilearn.demo;

public class multipleDimensional {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("print elements");
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++) {
				
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
	}

}
