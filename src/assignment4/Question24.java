package assignment4;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter factorial to n");
		
		int a = sc.nextInt();
		int fac = 1;
		
		for (int i = 1; i <= a; i++ ) {
			fac = fac * i;
			System.out.println(fac);
		}
		
	}

}
