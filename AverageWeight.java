package com.heraizen.cj.day1;

import java.util.Scanner;

public class AverageWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weight of the first person:");
		float p1=scan.nextFloat();
		System.out.println("Enter the weight of the second person:");
		float p2=scan.nextFloat();
		System.out.println("Enter the weight of the third person:");
		float p3=scan.nextFloat();
		float sum=p1+p2+p3;
		float avg=sum/3;
		System.out.println("The sum of weight of the 3 persons is " +sum+" Kgs and the average weight is "+avg+ "Kgs");

	}

}
