package $2BankAccountAppPractise;

public class $2BankAccount implements IRate{
	String accountNumber;
	// static >> belongs to CLASS variable
	// final make the varaible's vlue constant
	private static final String bankCode = "165145";
	private String name;
	String ifsc;
	long phno;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getInitAmount() {
		return initAmount;
	}

	public void setInitAmount(double initAmount) {
		this.initAmount = initAmount;
	}

	private String email;
	private double initAmount;

	// Constructor
	// 1. To initialize the propertise, value
	// 2. Same name as class itself
	// 3. Have no Return Type
	$2BankAccount() {
		System.out.println("New Account Created");
	}

	// Contructor Overloading
	$2BankAccount(String accountType) {
		System.out.println("Account Type: " + accountType);
	}

	void deposit(double deposit) {
		System.out.println("Amount Deposit: $" + deposit);
		stats(deposit);
	}

	void withDraw(double amount) {
		System.out.println("WithDraw Amount: $" + amount);
		balance(amount);
	}

	
	//	getters and setters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// Interface Methods
	@Override
	public void rate() {
		System.out.println("rate");
	}
	
	private void balance(double amount) {
		System.out.println("Remaining Balance: $" + (initAmount - amount));
	}

	private void stats(double amount) {
		System.out.println("BankCode: " + bankCode);
		System.out.println("Remaining Balance: $" + (amount + initAmount));
	}
}
