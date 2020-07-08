package assignment2;

import java.util.Scanner;

public class Question8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temp in F");
		double f = sc.nextDouble();
		double f_c = ((f-32)*5)/9;
		System.out.println("Temp in C is " + f_c);
		
		System.out.println("Enter temp in C");
		double c = sc.nextDouble();
		double c_f = ((c*5)/9)+32;
		System.out.println("Temp in F is " + c_f);
	}

}
