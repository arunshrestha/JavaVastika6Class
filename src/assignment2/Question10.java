package assignment2;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter which sub-question (a,b,c)");
		
		String sub = sc.next();
		
		if (sub.equals("a")) {
			
			System.out.println("value of u");
			double u = sc.nextDouble();
			System.out.println("value of t");
			double t = sc.nextDouble();
			System.out.println("value of a");
			double a = sc.nextDouble();
			
			double s = (u*t) + (0.5*a*t*t);
			
			System.out.println("value of s is " + s);
			
		} else if (sub.equals("b")) {
			
			System.out.println("value of a");
			double a = sc.nextDouble();
			System.out.println("value of b");
			double b = sc.nextDouble();
			System.out.println("value of c");
			double c = sc.nextDouble();
			
			double s = (a+b+c)/2;
			
			double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			
			System.out.println("value of area is " + area);
			
		} else if (sub.equals("c")) {
			
			System.out.println("value of a");
			double a = sc.nextDouble();
			System.out.println("value of b");
			double b = sc.nextDouble();
			System.out.println("value of c");
			double c = sc.nextDouble();
			
			double x = ((Math.sqrt((b*b)-4*a*c))-b)/(2*a);
			
			System.out.println("value of x is" + x);
			
		} else {
			System.out.println("Try again");
		}
		
		
		
	}
	

}
