package assignment2;

import java.util.Scanner;

public class Question6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter circle radius");
		double r = sc.nextDouble();
		double cperimeter = Math.PI*2*r;
		System.out.println("Perimeter of circle is: " + cperimeter);
		
		System.out.println("Enter rectangle length");
		double l = sc.nextDouble();
		System.out.println("Enter rectangle width");
		double w = sc.nextDouble();
		double rperimeter = 2*(l+w);
		System.out.println("Perimeter of rectangle is: " + rperimeter);
		
		System.out.println("Enter triangle length 1");
		double a = sc.nextDouble();
		System.out.println("Enter triangle length 2");
		double b = sc.nextDouble();
		System.out.println("Enter traingle length 3");
		double c = sc.nextDouble();
		
		double tperimeter = a+b+c;
		
		System.out.println("Perimeter of triangle is: " + tperimeter);
	}

}
