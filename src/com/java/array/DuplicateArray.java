package com.java.array;
/**
 * imports the scanner class of the java.utill package
 */
import java.util.Scanner;

public class DuplicateArray 
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
		System.out.println("enter the size of array");
		/*
		 * size of array
		 */
		int size = input.nextInt();
		/*
		 * Actual Array
		 */
		int number[] = new int[size];	
		System.out.println("enter the array elements");
		/*
		 * logic for declaring the array elements
		 */
		for (int i = 0; i<number.length;i++)
		{
			number[i]=input.nextInt();	
		}
		/*
		 * logic for checking duplicating Array
		 */	
		System.out.println("duplicate array elements");
		for (int i=0;i<number.length;i++)
			for (int j=i+1;j<number.length;j++)
				if (number[i]==number[j])
					System.out.println(number[j]);
	}
}
