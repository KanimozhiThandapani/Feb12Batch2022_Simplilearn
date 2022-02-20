package com.program;

import java.util.Scanner;

public class ArrayBiggestNumber {

	public static void main(String[] args) {
		int[] data = new int[5];
		Scanner sc= new Scanner(System.in);
		//To Read Numbers From User
		for(int i =0;i<data.length;i++) {
			System.out.println("Enter The Number");
			data[i]=sc.nextInt();
		}
		
		int maximum = fingBiggestNum(data);
		System.out.println("The Biggest Numebr is:"+maximum);

	}

	//Find the Biggest Number
	private static int fingBiggestNum(int[] data) {
		int max = data[0];
		for(int i =0;i<data.length;i++) {
			if(max<data[i]) {
				max=data[i];
			}
			
		}
		return max;
	}

}
