package assignment4;

import java.util.Scanner;

public class Question31 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		
		int n = sc.nextInt();
		Question31 q = new Question31();
		
		q.patternGen(n);
		
		
	}
	
	public void patternGen(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}
