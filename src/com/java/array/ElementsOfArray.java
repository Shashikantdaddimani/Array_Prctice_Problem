package com.java.array;
/**
 * imports the scanner class of the java.utill package
 */
import java.util.Scanner;
//main class
public class ElementsOfArray 
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
		 *  initializing size of Array
		 */
		int size = input.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter the Array elements");
		
		for (int i=0;i<array.length;i++)
		{
			array[i]=input.nextInt();
		}
		/*
		 * logic for declaring  given array element
		 */
		System.out.println("Elements of given Array ");
		for (int i=0;i<size;i++)
			System.out.println(array[i]);
		

	}

}
