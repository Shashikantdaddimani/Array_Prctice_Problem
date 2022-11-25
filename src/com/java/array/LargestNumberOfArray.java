package com.java.array;

/**
 * imports the scanner class of the java.utill package
 */
import java.util.Scanner;
//main class
public class LargestNumberOfArray 
{
	/**
	 * program execution starts from main method
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/**
		 * Taking user input using Scanner object
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Size");
		
		/*
		 * size of array
		 */
		int size = input.nextInt();
		
		/*
		 * declare Actual array
		 */
		int number[]= new int[size];
		int maximum = number[0];
		 System.out.println("Enter the array elements ");
		 
		/*
		 * Take Inputs array from user
		 */
		 for (int i=0;i<number.length;i++)
		 {
			 number[i]=input.nextInt();
			 
		 }
		 /*
		  * logic for checking maximum  of given array elements
		  */
		 for (int i=0;i<number.length;i++)
		 {
			 if (number[i]>maximum)	
			 {
				 maximum=number[i];
				 
			 }
		 }
		 System.out.println("The gretest number of given array elements:"+maximum);
		 
	}

}
