package assignment2;

import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Principal:");
		double p = sc.nextDouble();
		System.out.println("Enter Time:");
		double t = sc.nextDouble();
		System.out.println("Enter Rate:");
		double r = sc.nextDouble();
		
		double i = (p*t*r) /100;
		
		System.out.println("Interest is: " + i);
		
		sc.close();
	}

}
