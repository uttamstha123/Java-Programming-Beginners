package $2BankAccountAppPractise;

public class $1BankAccountApp {

	public static void main(String[] args) {
//		$2BankAccount account1 = new $2BankAccount();
//		$2BankAccount account2 = new $2BankAccount("Savings");
		/*
		$3SavingAccount acc1 = new $3SavingAccount();
		acc1.accountType = "Saving";
		acc1.name = "Uttam Shrestha";
		acc1.email = "shresthauttam2@gmail.com";
		acc1.totalAmount = 1500;
		acc1.totalBalance(500);
		*/
		
		// Access Specifier --> [ default , public , private , protected]
		
		$2BankAccount acc = new $2BankAccount();
		acc.rate();
		/*
		acc.name = "John Shrewd";
		acc.email = "john12shrewd@gmail.com";
		acc.initAmount = 1500;
		*/
		
		// Encapsulation method to assign the variable
		acc.setName("Uttam");
		System.out.println("Name: "+ acc.getName());
		acc.setEmail("shresthauttam66@gmail.com");
		System.out.println("Email: "+acc.getEmail());
		acc.deposit(500);
		acc.withDraw(1000);
		
	}

}
