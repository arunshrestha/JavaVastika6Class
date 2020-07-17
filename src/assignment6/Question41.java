package assignment6;

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter word");
		
		String in = sc.next();
		
		char[] arr = in.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]==arr[i]) {
					sb.append(arr[i]);
					sb.append(" ");
				}
			}
		}
		
		System.out.println();
		
		System.out.println(sb);
		
	}

}
