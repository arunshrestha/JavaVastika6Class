package assignment4;

import java.util.Scanner;

public class Question26 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number you want to reverse: ");
		int number = sc.nextInt();
		
		int rev = 0;
		
		while(number!=0) {
			int digit = number%10;
			rev = (rev*10)+digit;
			number = number/10;
		}
		System.out.println(rev);
	}
	
}
