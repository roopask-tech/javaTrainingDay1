package com.heraizen.cj.day1;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the empno:");
		int empid=scan.nextInt();
		System.out.println("Enter the employee name:");
		String name=scan.next();
		System.out.println("Enter the monthly salary:");
		int salary = scan.nextInt();
		int yearsal=salary*12;
		System.out.println("Hi "+name+"! Your employee id is "+empid+", monthly salary is Rs "+salary+" and yearly salary is Rs "+yearsal);
	}
}
