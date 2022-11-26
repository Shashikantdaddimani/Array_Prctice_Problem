package com.java.array;

/**
 * imports all the class of the java.util package
 */
import java.util.*;

//main class
public class SortArrayAscending 
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
		System.out.println("Enter the size of array Elements");
		//size of array
		int size = input.nextInt();
		//Actual array
		int number[]=new int[size];
		System.out.println("Enter the array elements");
		/*
		 * logic for declaring the array elements
		 */
		for (int i=0;i<number.length;i++)
		{
			number[i]=input.nextInt();
			
		}
		/*
		 * Logic for finding the Ascending order
		 */
		Arrays.sort(number);
		System.out.println("Sorted elements are");
		for (int i=0;i<number.length;i++)
			System.out.println(number[i]);
	}

}
