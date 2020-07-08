package assignment2;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter swap method (a,b)");
		
		String in = sc.next();
		
		if (in.equals("a")) {
			swap1(a,b);
		} else if (in.equals("b")) {
			swap2(a,b);
		} else {
			System.out.println("try again");
		}
		
	}

	private static void swap2(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
		System.out.println("Swapping without temp variable");
		
		a = a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
	}

	private static void swap1(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
		System.out.println("Swapping with temp variable");
		
		int c = a;
		
		a = b;
		
		b = c;
		
		System.out.println("a is " + a);
		System.out.println("b is " + b);
	}

}
