

package com.practice;
import java.util.Scanner;
//import java.util.*;
public class Operators2 {
	double tip;
	double baseCost;
	double tax;
	double price;
	double mealCost;
	double tipPercent;
	double taxPercent;
	double totalPrice;
	public double mealBaseCost(double d) {
		baseCost = d;
		return baseCost;
	}
	public double getTip(double d) {
	  tipPercent = (d/100);
	  tip = tipPercent*baseCost;
	  return tip;
	}
	
	public double getTax(double d) {
		  taxPercent = d/100;	
		  tax = taxPercent*baseCost;
		  return tax;
		}
	public double value(double d1, double d2, double d3) {
		price= d1+d2+d3;
		return price;
	}
	
	public static void main(String[] args) {
		Operators2 op = new Operators2();
		//Operators op1= new Operators();
		Scanner f = new Scanner(System.in);
		System.out.println("Pls enter the base value for op: ");
		op.mealCost = op.mealBaseCost(f.nextDouble());
		
		
		System.out.println("Pls enter the tip rate in integer: ");
		 op.tipPercent = op.getTip(f.nextDouble());
		//op.tipPercent = (f.nextDouble()/100)*op.mealCost;
		//op.tipPercent = .05*op.mealCost;
		System.out.println("Pls enter the tax rate in integer: ");
		op.taxPercent=op.getTax(f.nextDouble());
		//op.taxPercent= (f.nextDouble()/100)*op.mealCost;
		op.totalPrice = op.value(op.mealCost, op.tipPercent, op.taxPercent);//(op.mealCost+op.tipPercent+op.taxPercent);
		System.out.printf ("The cost of meal is :%.2f \n",op.mealCost);
		System.out.printf ("The tip :%.2f\n",op.tipPercent);
		System.out.printf ("The tax : %.2f\n",op.taxPercent);
		System.out.printf ("The total price of meal: %.0f ",op.totalPrice);
		//System.out.println ("The total price of meal:  "+round(op.totalPrice));
        f.close();
	}
}
