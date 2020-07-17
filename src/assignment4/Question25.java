package assignment4;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int num = sc.nextInt();

		String studentName="";
		int maxScore=0;


		for(int i=0;i<num;i++) {
			System.out.println("Enter student's name: ");
			String name = sc.next();
			System.out.println("Enter student's score: ");
			int score = sc.nextInt();
			
			if(score>maxScore) {
				maxScore=score;
				studentName=name;

			}

		}
		System.out.println("Student with hightst score is "+studentName+" with "+maxScore);
	}

}
