package assignment3;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println(num);
		} else {
			System.out.println("Enter negative num");
		}
	}

}
