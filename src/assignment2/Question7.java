package assignment2;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cylinder radius");
		double r = sc.nextDouble();
		System.out.println("Enter cylinder length");
		double l = sc.nextDouble();
		double vol = Math.PI*r*r*l;
		System.out.println("Volume of cylinder is: " + vol);
	}

}
