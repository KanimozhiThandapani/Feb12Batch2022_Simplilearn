package com.program;

import java.util.Scanner;

public class ArrayAddAvg {
	
	static int sum = 0;
	static int average;

	public static void main(String[] args) {
		int[] data = new int[5];
		Scanner sc= new Scanner(System.in);
		//To Read Numbers From User
		for(int i =0;i<data.length;i++) {
			System.out.println("Enter The Number");
			data[i]=sc.nextInt();
		}
		
		sum = findTheSum(data);
		System.out.println("The Sum of the Numbers is:"+sum);	
		
		average=sum/data.length;
		System.out.println("The Average of the Numbers is:"+average);
	
	}
	
	
	//To find the Sum
	public static int findTheSum(int[] data) {
		for(int d:data) {
			sum = sum+d;//sum+=d;
		}
		return sum;
	}

}
