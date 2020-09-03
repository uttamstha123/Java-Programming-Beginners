package $4BankAccount;

public class BankAccountApp {
	public static void main(String[] args) {
		Current checkAcc = new Current("Sunita Shrestha", "984637218", 2000);
		Saving saveAcc = new Saving("Uttam Shrestha", "374635280", 1500);

		checkAcc.showInfo();
		System.out.println("*************************************");
		saveAcc.showInfo();
		System.out.println("*************************************");
		saveAcc.deposit(20000);
		saveAcc.withdraw(200);
		saveAcc.transfer("Sunita", 500);
		saveAcc.printBalance();
		// Read the CSV file and then create the Account on that Data
	}
}
