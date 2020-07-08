package assignment2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a+b;
		int avg = (a+b)/2;
		
		System.out.println("Sum is: " + sum);
		System.out.println("Average is " + avg);
		
		sc.close();
	}

}
