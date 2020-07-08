package assignment2;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll");
		int roll = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter nationality");
		String nation = sc.next();
		
		System.out.println();
		System.out.println(roll + " " + name + " from " + nation);
	}

}
