package assignment4;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibonacciSeries(n);
		
	}
	
	public static void fibonacciSeries(int n) {
		int a=1;
		int b=1;
		int c;
		System.out.print(a+"\n"+b);
		System.out.println();
		
		for(int i=2;i<=n;i++) {
			c=a+b;
			
			System.out.println(c+" ");
			a=b;
			b=c;
			
			
		}
	}

}
