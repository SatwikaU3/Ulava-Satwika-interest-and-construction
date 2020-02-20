package com.epam.simple.demo;

import java.util.Scanner;

public class Main_interest {
	public static void main(String [] args)
	{
		Scanner scanner=new Scanner(System.in);
		int principle_amount=scanner.nextInt();
		int time=scanner.nextInt();
		int rate_of_interest=scanner.nextInt();
		Simple_interest s=new Simple_interest();
		Compound_interest c=new Compound_interest();
		System.out.println("Simple Interest : "+s.simple(principle_amount,time,rate_of_interest));
		System.out.println("Compound Interest : "+c.compound(principle_amount,time,rate_of_interest));
		
		
	}
}
