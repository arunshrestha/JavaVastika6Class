package assignment6;

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a: ");
		int a =sc.nextInt();
		
		System.out.println("Enter b: ");
		int b =sc.nextInt();
		
		try {
			int div = a/b;
			System.out.println(div);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Enter size of array: ");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter "+i+" item");
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter index: ");
		
		int index = sc.nextInt();
		
		try {
			System.out.println(arr[index]);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
