package assignment2;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weight in lb");
		double lb = sc.nextDouble();
		double kg = lb*0.454;
		System.out.println("Weight in kg is " + kg);
	}

}
