package assignment4;

public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question28 q = new Question28();
		
		System.out.println(q.isPrime(23));
		
		
		System.out.println(q.firstNthPrime(20));
		System.out.println();
		
		q.allPrimeBetween(20, 50);

	}
	
	public boolean isPrime(int a) {
		
		if (a==1) {
			return false;
		}
		
		for (int i=2; i <= Math.sqrt(a); i++) {
			if (a%i==0) {
				
				return false;
			}
		}
		return true;
	}
	
	public int firstNthPrime(int a) {
		int value = 0;
		int count = 1;
		while(a!=0) {
			if(isPrime(count)) {
				a--;
				//System.out.println(count);
				value = count;
				count++;
			} else {
				count++;
			}
		
		}
		return value;
	}
	
	public void allPrimeBetween(int a, int b) {
		int[] arr = {};
		for(int i = a; i <=b; i++) {
			if (isPrime(a)) {
				System.out.println(a);
			}
			a++;
		}
		
	}
	
	

}
