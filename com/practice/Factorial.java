package com.practice;
import java.util.Scanner;
public class Factorial {
	static Scanner s = new Scanner(System.in);
     int f;
	public int fact (int n) {
	 if (n==0 | n==1)
	 {
		// System.out.println(1);
		 return 1;
		 
	  }
	 else
	 {
		 
	 //System.out.println(n);
		f = n*fact(n-1);
		 }

	 return f;
	 
	}
		public static void main(String[] args){
			Factorial facto = new Factorial();
			System.out.println("Enter a positive number to find its factorial: ");
			int t = s.nextInt();
			if (t >=0)
			{
				System.out.println(facto.fact(t));
		    }
			else 
			{
				System.out.println("You have entered a negative number ");
				
			}
			
		}
	}

