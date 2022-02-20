package com.program;

import java.util.Scanner;

public class BubbleSortArray {

		  static void bubbleSortAsc(int[] myarray) {
		    int n = myarray.length;
		    int temp = 0;
		    for (int i = 0; i < n; i++) {
		      for (int j = 1; j < (n - i); j++) {
		        if (myarray[j - 1] > myarray[j]) {
		          //Code to swap the elements
		          temp = myarray[j - 1];
		          myarray[j - 1] = myarray[j];
		          myarray[j] = temp;
		        }
		      }
		    }
		  }
	public static void main(String[] args) {
		int[] myArray = new int[5];
		Scanner sc= new Scanner(System.in);
		//To Read Numbers From User
		for(int i =0;i<myArray.length;i++) {
			System.out.println("Enter The Number");
			myArray[i]=sc.nextInt();
		}
		
		System.out.println("Array on which we apply Bubble Sort: ");
		for (int i = 0; i < myArray.length; i++) 
		{
		    System.out.print(myArray[i] + " ");
		}
		    System.out.println();
		    
		bubbleSortAsc(myArray); //Applying Bubble sort to sort the Array  
	    System.out.println("Array after applying Bubble Sort: ");
		for (int i = 0; i < myArray.length; i++) 
		{
		    System.out.print(myArray[i] + " ");
		}
  }
}
