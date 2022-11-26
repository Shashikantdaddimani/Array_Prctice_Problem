package com.java.array;

/**
 * imports all the class of the java.util package
 */
import java.util.*;

public class SecondLargestElement 
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
		System.out.println("Enter the size of elements");
		/*
		 * size of array
		 */
		int size = input.nextInt();
		/*
		 * Actual Array
		 */
		int number[] = new int[size];
		int length =number.length;
		System.out.println("Enter the array elements .");
		/*
		 * logic for declaring the array elements
		 */
		for(int i=0;i<length;i++)
		{
			number[i]=input.nextInt();
		}
		/*
		 * sorting array elements
		 */
     	Arrays.sort(number);
     	System.out.println("Sorted element element is");
     	/*
     	 * Logic for finding the second largest element
     	 */
		for(int i=0;i<length;i++)	
		{
			System.out.println(number[i]);
		}
		System.out.println("second largest elements is =:"+number[length-2]);

	}

}
