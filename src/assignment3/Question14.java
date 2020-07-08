package assignment3;

import java.util.Scanner;

public class Question14 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter first num: ");
		int a = sc.nextInt();
		System.out.println("Enter second num: ");
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println("first > second");
		} else if (a < b) {
			System.out.println("first < second");
		} else {
			System.out.println("first = second");
		}
		
	}

}
