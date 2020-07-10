package assignment4;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num for table:");
		
		int a = sc.nextInt();
		
		for (int i = 1; i <= 10; i++ ) {
			System.out.println(a +" x "+ i + " = " + (a*i));
		}
	}

}
