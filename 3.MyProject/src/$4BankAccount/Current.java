package $4BankAccount;

public class Current extends Account {
	// List some specific properties for current
	private long debitCardNo;
	private int debitCardPin;

	// Create constructor to initilize common properties
	public Current(String name, String sSN, int initDeposit) {
		super(name, sSN, initDeposit);
		accountno = "1" + accountno;
		setDebitCard();
	}
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	private void setDebitCard() {
		debitCardNo = (long) (Math.random() * Math.pow(10 , 12));
		debitCardPin = (int) (Math.random() * Math.pow(10 , 4));
	}
	// List some specific method
	public void showInfo() {
		System.out.print("Account Type : " + "Current");
		super.showInfo();
		System.out.println(
				"Debit CardNumber : " + debitCardNo +
				"\nDebit CardPin : " + debitCardPin
				);
	}
}
