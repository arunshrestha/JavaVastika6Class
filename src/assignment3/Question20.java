package assignment3;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first num");
		double a = sc.nextInt();
		
		System.out.println("enter second num");
		double b = sc.nextInt();
		
		System.out.println("enter operation");
		char o = sc.next().charAt(0);
		
		switch(o) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println((double)(a/b));
			break;
		default:
			System.out.println("Enter valid");
		}
			
				
		
	}

}
