package assignment4;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the nth term ");
		int num=input.nextInt();
		Question29 q = new Question29();
		q.sumOfNthterm(num);
		input.close();
	}
	
	public void sumOfNthterm(int n) {
		
		double sum=0.0;
		double factor=1;
		
		
		for(int i=1;i<=n;i++) {
		
			factor=factor*i;
			sum=sum+(i/factor);
		
		}
		System.out.println(sum);
		
		
	}

}
