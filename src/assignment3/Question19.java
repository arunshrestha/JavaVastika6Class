package assignment3;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the value of side a of a triangle: ");
		int a=sc.nextInt();
		
		System.out.print("Enter the value of second side b of a triangl: ");
		int b=sc.nextInt();
		
		System.out.print("Enter the value of third side of a triangle: ");
		int c=sc.nextInt();
		
		if(a==b&&b==c) {
			System.out.println("Equilateral triangle.");
		}else if(a==b||a==c||b==c) {
			System.out.println("Isoceles triangle.");
		}else {
			System.out.println("Scalene triangle.");
		}
		
	}

}
