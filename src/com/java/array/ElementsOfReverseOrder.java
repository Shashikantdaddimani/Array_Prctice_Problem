package com.java.array;
/**
 * imports the scanner class of the java.utill package
 */
import java.util.Scanner;

public class ElementsOfReverseOrder
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
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the size of element");
		//size of array
		int size = input.nextInt();
		//Actual array
		int number[] = new int[size];
		System.out.println("Enter the array elements");
		//declare array elements
		for (int i=0;i<number.length;i++)
		{
			number[i]= input.nextInt();
		}
		//Logic for checking reverse number
		System.out.println("Reversed elements of array");
		for (int i=size-1;i>=0;i--) 
		{
			System.out.print(number[i]);
		}
			
	}

}
