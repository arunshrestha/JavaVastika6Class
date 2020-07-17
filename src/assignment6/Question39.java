package assignment6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Question39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String input = sc.nextLine();
		
		System.out.println(input);
		
		String[] arr = input.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < arr.length - 1; i++) {
			sb.append(arr[i].charAt(0));
			sb.append(". ");
		}
		
		System.out.println(sb.append(arr[arr.length-1]));

	}

}