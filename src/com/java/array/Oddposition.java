package com.java.array;
/**
 * imports the scanner class of the java.utill package
 */
import java.util.Scanner;
//main class
public class Oddposition 
{
	/**
	 * program execution starts from main method
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/*
		 * Taking user input using Scanner object
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size");
		/*
		 * size of array
		 */
		int size = input.nextInt();
		/*
		 * declare Actual array
		 */
		int number[]=new int[size];
		System.out.println("Enter the array elements");
		/*
		 *declare the array elements
		 */
		for (int i= 0;i<number.length;i++)
		{
			number[i]=input.nextInt();
			
		}
		/*
		 * logic for checking OddPosition of given array elements
		 */
		for (int i=0;i<number.length;i++)
		{
			if(i%2!=0)
				System.out.println("Odd position -> "+number[i]);
		}
	}

}
