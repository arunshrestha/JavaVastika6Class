package assignment4;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number you want to sum and product digits: ");
		int number = sc.nextInt();
		
		int sum = 0;
		int product = 1;
		
		while(number!=0) {
			int digit = number%10;
			sum = sum + digit;
			product = product * digit;
			number = number/10;
		}
		
		System.out.println(sum);
		System.out.println(product);

	}

}
