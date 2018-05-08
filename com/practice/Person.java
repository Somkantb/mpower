package com.practice;

public class Person
{
	int age;
	Person(int initialAge)
	{
	if (initialAge < 0 )
	{
		this.age = 0;
		System.out.println("Age is not valid, setting age to 0");
	}
	this.age = initialAge;
	}
	public void yearPasses(Person p) {
	p.age = age+3;
	amIOld(p);
	}
	public  void amIOld(Person o) {
		if ( o.age <13)
		{
			System.out.println("You are too young");
		}
		else if(o.age >=13 & o.age <18 )
		{
			System.out.println("You are a teenager");	
		}
		else
			System.out.println("You are old");
	}
public static void main(String[] args)
{
	Person Prem = new Person (-1);
	Prem.amIOld(Prem);
	Prem.yearPasses(Prem);
	System.out.println();
	
	Person Ram = new Person(10);
	Ram.amIOld(Ram);
	Ram.yearPasses(Ram);
	System.out.println();
	
	Person Arun = new Person(16);
	Arun.amIOld(Arun);
	Arun.yearPasses(Arun);
	
	
}
}
