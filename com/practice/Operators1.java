package com.practice;
import java.util.Scanner;

public class Operators1 {
	double basePrice;
	double tipPercent;
	double tip;
	double tax;
	double taxPercent;
	double totalPrice;
	//Scanner f;
	Scanner f = new Scanner(System.in);
	public double getBasePrice() {
		
		System.out.println("Enter base price: ");
		basePrice = f.nextDouble();
		return basePrice;
	}
	public double getTip() {
		
		System.out.println("Enter tip rate: ");
		tipPercent = f.nextDouble();
		tip = (basePrice*tipPercent/100);
		return tip;
	}
	public double getTax() {
		System.out.println("Enter tax rate: ");
		taxPercent = f.nextDouble();
		tax = (basePrice*taxPercent/100);
		return tax;
		
	}
	public double getTotalPrice() {
		return (basePrice+tip+tax);	
	}
	public static void main(String[]args) {
		Operators1 op = new Operators1();
	   // Scanner f = new Scanner(System.in);
		op.basePrice = op.getBasePrice();
		op.tip=op.getTip();
		op.tax = op.getTax();
		op.totalPrice=op.getTotalPrice();
		System.out.printf("Base price: %.2f$ \n",op.basePrice);
		System.out.printf("Tip : %.2f$ \n",op.tip);
		System.out.printf("Tax : %.2f$\n",op.tax);
		System.out.printf("Total price : %.2f$",op.totalPrice);
		
	}

}
