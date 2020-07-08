package assignment3;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num: ");
		
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println("Num is even ");
		} else {
			System.out.println("Num is odd ");
		}
	}

}
