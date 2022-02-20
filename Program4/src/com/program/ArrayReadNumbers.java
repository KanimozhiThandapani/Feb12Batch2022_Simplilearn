package com.program;

import java.util.Scanner;

//To Read 5 Numbers from User and Print the numbers using for & foreach loop
public class ArrayReadNumbers {

	public static void main(String[] args) {
		
		int[] data = new int[5];
		Scanner sc= new Scanner(System.in);
		
		//To Read Numbers From User
		for(int i =0;i<data.length;i++) {
			System.out.println("Enter The Number");
			data[i]=sc.nextInt();
		}
		
		//To Print the Numbers(for)
		System.out.println("Using for Loop");
		for(int i =0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		//To Print the Number(for each)
		System.out.println("Using for each Loop");
		for(int d:data) {
			System.out.println(d);
		}
			

	}

}
