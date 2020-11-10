package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumOfNaturalNubers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Nmber :");
		int a = scan.nextInt();
		System.out.println("Enter the Second Nmber :");
		int b = scan.nextInt();
		int c = a+b;
		System.out.println("Sum of "+a+" and "+b+" is : "+c);
	}

}
