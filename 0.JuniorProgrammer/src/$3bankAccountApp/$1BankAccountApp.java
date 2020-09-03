package $3bankAccountApp;

public class $1BankAccountApp {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("64366464", 1500.500);
		account1.setName("Uttam");
		account1.deposit(550);
		System.out.println(account1.getName());
		System.out.println("*************");
		BankAccount account2 = new BankAccount("24344464", 2000);
		account2.setName("Sunita");
		System.out.println(account2.getName());
		System.out.println("*************");
		BankAccount account3 = new BankAccount("7566464", 1000.75);
		System.out.println("*************");
		account3.setName("Saroj");
		System.out.println(account3.getName());
	}

}

class BankAccount {
	// properties of bank account --> Encapsulation
	private String name;
	private String accountNumber; // id + 2digit random number + first 2 ssn
	private String email;
	private String ssn;
	private double balance;
	private static int id = 100;
	private static final String bankCode = "02156";

	// Constructor
	BankAccount(String ssn, double initDeposit) {
		balance = initDeposit;
		System.out.println("Account has been Created" + "\nBank Code:" + bankCode);
		System.out.println("-------------------------");
		this.ssn = ssn;
		id++;
		System.out.println("Your id : " + id);
		setAccountNumber();
		System.out.println("Initial Balance : $" + showBalance());

	}

	// Getters and Setters
	private void setAccountNumber() {
		int random = (int) Math.random() * 100;
		accountNumber = id + "" + random + ssn.substring(0, 2);
		System.out.println("Your Account Number : " + accountNumber);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return ("Name: " + this.name);
	}

	public void withDraw(double amount) {
		balance -= amount;
		System.out.println("Remaining Balance : $" + showBalance());
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Total Balance : $" + showBalance());
	}

	private Double showBalance() {
		return balance;
	}

}