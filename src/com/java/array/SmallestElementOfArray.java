package com.java.array;
/**
 * imports the scanner class of the java.utill package
 */
import java.util.Scanner;
//main class
public class SmallestElementOfArray
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
		System.out.println("Enter the size of array");
		/*
		 * size of array
		 */
		int size = input.nextInt();
		/*
		 * declare Actual array
		 */
		int number[]= new int[size];
		
		System.out.println("Enter the elements of array ");
		/*
		 * Take Inputs array from user
		 */
		for (int i=0;i<number.length;i++)
		{
			number[i]=input.nextInt();
		
		}
		//initializing the  minimum variable
		int minimum = number[0];
		 /*
		  * logic for checking minimum  of given array elements
		  */
		for (int i=1;i<number.length;i++)
		{
			if (number[i]<minimum)
				minimum=number[i];
			
		}
		System.out.println("The Smallest number of the given array elements is :"+minimum);

	}

}
