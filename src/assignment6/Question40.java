package assignment6;

import java.util.Scanner;

public class Question40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to reverse");
		String input = sc.next();
		
		char[] arr = input.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = (arr.length-1); i>=0; i--) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb);

	}

}
