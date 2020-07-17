package assignment6;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to reverse");
		String input = sc.next();
		
		String rev = reverse(input);
		
		System.out.println(input.equals(rev));
		
		

	}
	
	public static String reverse(String s) {
		
		char[] arr = s.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = (arr.length-1); i>=0; i--) {
			sb.append(arr[i]);
		}
		
		return sb.toString();
		
	}

}
