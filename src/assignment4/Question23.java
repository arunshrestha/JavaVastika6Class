package assignment4;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sum to n");
		
		int a = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= a; i++ ) {
			sum = sum + i;
			System.out.println(sum);
		}
	}

}
