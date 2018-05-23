package mpower.java.assignment;
import java.util.Scanner;
/** the program is designed to accomodate user requests for height up to six levels*/
public class PyramidAstrisk {
 static Scanner f = new Scanner(System.in);
 static int count ;
/** we are using Scanner class variable f to accept user input*/
	public static void main(String[] args) {
		System.out.println("Enter the height of pyramid in terms of no of rows: ");
		count= f.nextInt();
		/** usage of for and switch methods to match the user input for height*/
		for (int j=1; j<=count; j++ )
		{
			switch( j) {
		case 1: 
			/** in each matching,first for loop with empty print statement is used to create the gap essential to make pyramid*/
			for (int k =1; k<=count; k++) {
			System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
			break;
		case 2:
			/** in each matching case,first for loop with empty print statement is used to create the gap essential to make pyramid*/
			for (int k =1; k<=count-1; k++) {
				System.out.print(" ");
				}
			/** in each matching case, second for loop with print(*) statements is used to create the body of pyramid*/
			for (int k =1; k<=3; k++) {
				System.out.print("*");
				}
				
				System.out.println("");
				break;
	case 3:
		for (int k =1; k<count-1; k++) {
			System.out.print(" ");
			}
		for (int k =1; k<=5; k++) {
			System.out.print("*");
			}
			
			System.out.println("");
			break;
			
	case 4:
		for (int k =1; k<count-2; k++) {
			System.out.print(" ");
			}
		for (int k =1; k<=7; k++) {
			System.out.print("*");
			}
			
			System.out.println("");
			break;	
			
	case 5:
		for (int k =1; k<count-3; k++) {
			System.out.print(" ");
			}
		for (int k =1; k<=9; k++) {
			System.out.print("*");
			}
			
			System.out.println("");
			break;	
	case 6:
		for (int k =1; k<count-4; k++) {
			System.out.print(" ");
			}
		for (int k =1; k<=11; k++) {
			System.out.print("*");
			}
			
			System.out.println("");
			break;	
		default:
			System.out.println("it has been programmed up to height 6");
			
			
		    }
		
}}}
