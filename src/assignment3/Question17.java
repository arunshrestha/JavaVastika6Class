package assignment3;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		
		int num = sc.nextInt();
		
		if (num%4==0) {
			System.out.println("Leap Year ");
		} else {
			System.out.println("Not a leap year ");
		}
		
	}

}
