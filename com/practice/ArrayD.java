package com.practice;
import java.util.Scanner;
import java.util.*;
public class ArrayD {
	 Scanner f = new Scanner(System.in);
	 Scanner f1 = new Scanner(System.in);
	//static int numbers;
	int numbers;
	String s;
    String []sampleArray;
    
	public ArrayD()
	{
		System.out.println("Please enter the number of elements in the array: ");
		this.numbers = this.f.nextInt();
		
	}
	
	public void armethod()
	{
		if (numbers >=1 & numbers <=1000)
		{
			System.out.println("Please enter the elements one by one in the array: ");
			s = f1.nextLine();
			//System.out.println(s);
			sampleArray = s.split(" ");
			for(int i= sampleArray.length-1;i>= 0;i--) {
				System.out.print(sampleArray[i]);	
				System.out.print(" ");
			}
		
	}
	}
	
	public static void main(String [] args)
	{
		ArrayD ard = new ArrayD();
		ard.armethod();
		/*System.out.println("Please enter the number of elements in the array: ");
	numbers = f.nextInt();
		ard.armethod();
	if (numbers >=1 & numbers <=1000)
	{
		System.out.println("Please enter the elements one by one in the array: ");
		s = f1.nextLine();
		//System.out.println(s);
		sampleArray = s.split(" ");
		for(int i= sampleArray.length-1;i>= 0;i--) {
			System.out.print(sampleArray[i]);	
			System.out.print(" ");
		}
		//System.out.println(Arrays.toString(sampleArray));
		
		
	}*/
	}
		
	}

