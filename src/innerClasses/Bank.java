package innerClasses;

public class Bank {
	
	private double balance;
	
	public void showBalance() {
		System.out.println(this.balance);
	}

	

	public Bank(double balance) {
		super();
		this.balance = balance;
	}



	class Account{
		public void deposit(double amount) {
		 Bank.this.balance += amount;
			System.out.println(balance);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank(1000);
		Account a = b.new Account();
		b.showBalance();
		a.deposit(200); 
		b.showBalance();
	}

}
