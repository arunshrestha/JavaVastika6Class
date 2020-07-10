package Lab1;

public class BankAccount {
	
	private double balance;
	private String name;
	private static int number = 1;
	private int accntNumber;
	
	
	public BankAccount(String name, double balance) {
		this.setAccntNumber(number);
		number++;
		this.setName(name);
		this.setBalance(balance);
		displayInfo();
	}
	
	public BankAccount(String name) {
		this.setAccntNumber(number);
		number++;
		this.setName(name);
		this.setBalance(0);
		displayInfo();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccntNumber() {
		return accntNumber;
	}

	public void setAccntNumber(int accntNumber) {
		this.accntNumber = accntNumber;
	}
	
	public void displayInfo() {
		System.out.println("============");
		System.out.println("Account Number: " + getAccntNumber());
		System.out.println("Balance: " + getBalance());
		System.out.println("============");
		System.out.println();
	}
	
	public void deposit(double amount) {
		
		if (amount < 0) {
			System.out.println("Please enter valid amount");
		} else {
			displayInfo();
			System.out.println("Depositing ... ");
			setBalance((getBalance() + amount));
		}
		displayInfo();
		
	}
	
	public void deposit(double amount, double interest) {
		if (amount < 0 || interest < 0) {
			System.out.println("Please enter valid amount or interest");
		} else {
			displayInfo();
			System.out.println("Depositing with interest ... ");
			double newAmount =  (getBalance() + amount);
			double intAmount = (newAmount*interest)/100;
			setBalance((newAmount+intAmount));
		}
		displayInfo();
		
	}
	
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Please enter valid amount");
		} else {
			displayInfo();
			System.out.println("Withdrawing ... ");
			setBalance((getBalance() - amount));
		}
		displayInfo();
		
	}
	
	public void withdraw(double amount, double fee) {
		if (amount < 0) {
			System.out.println("Please enter valid amount or fee");
		} else {
			displayInfo();
			System.out.println("Withdrawing with fee ... ");
			setBalance((getBalance() - amount - fee));
		}
		displayInfo();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1 = new BankAccount("abc", 100.0);
		BankAccount ba2 = new BankAccount("def");
		
		ba1.withdraw(25.00);
		ba1.deposit(20.00);
		
		ba2.deposit(100, 15);
		ba2.withdraw(15, 5);

	}

}
