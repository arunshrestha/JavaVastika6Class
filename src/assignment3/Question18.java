package assignment3;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st num: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd num: ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd num: ");
		int c = sc.nextInt();

		if (a<b) {
			if (b>c) {
				System.out.println("2nd is highest");
			} else {
				System.out.println("3rd is highest");
			}

		} else if (a>b ) {
			if (a>c) {
				System.out.println("1st is highest");
			} else {
				System.out.println("3rd is highest");
			}
		} else {
			System.out.println("1st is highest");
		}

	}
}
