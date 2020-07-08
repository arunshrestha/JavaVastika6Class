package assignment3;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		if (a>=0 && a <=128) {
			char c = (char) a;
			System.out.print(a); 
		} else {
			System.out.println("enter valid num");
		}
	}

}
