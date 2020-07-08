package assignment2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter circle radius");
		double r = sc.nextDouble();
		double carea = Math.PI*r*r;
		System.out.println("Area of circle is: " + carea);
		
		System.out.println("Enter rectangle length");
		double l = sc.nextDouble();
		System.out.println("Enter rectangle width");
		double w = sc.nextDouble();
		double rarea = l*w;
		System.out.println("Area of rectangle is: " + rarea);
		
		System.out.println("Enter triangle length 1");
		double a = sc.nextDouble();
		System.out.println("Enter triangle length 2");
		double b = sc.nextDouble();
		System.out.println("Enter traingle length 3");
		double c = sc.nextDouble();
		double p = (a+b+c)/2;
		
		double tarea = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
		
		System.out.println("Area of triangle is: " + tarea);

	}

}
