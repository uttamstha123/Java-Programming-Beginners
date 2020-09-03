package $4BankAccount;

public abstract class Account implements BRate {

	private String name;
	private String ssn;
	double balance;
	protected String accountno;
	protected double rate;
	private static int index = 10000;
	// List common properties for both savings and current

	// Create constructors to set base properties and initilize account
	public Account(String name, String sSN, int initDeposit) {
		this.name = name;
		this.ssn = sSN;
		balance = initDeposit;

		// set Account Number
		index++;
		this.accountno = setAccountNumber();
		setRate();
	}

	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoSsn = this.ssn.substring(this.ssn.length() - 2, this.ssn.length());
		int uniqueId = index;
		int rand = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSsn + uniqueId + rand;
	}

	// List common methods
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Desopiting amount : $" + amount);
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing amount : $" + amount);
	}
    public void transfer(String toWhere, double amount) {
    	balance = balance - amount;
    	System.out.println("Transfering amount : $"+ balance + " To "+toWhere);
    }
    public void printBalance() {
    	System.out.println("your Balance is now : $" + balance);
    }
	public void showInfo() {
		System.out.println("\nName : " + name + "\nAccount Number : " + accountno + "\nInitial Deposit : $" + balance
				+ "\nSocial Security Number : " + ssn + "\nRate : " + rate + "%");
	}
}
