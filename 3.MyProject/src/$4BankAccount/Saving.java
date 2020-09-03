package $4BankAccount;

public class Saving extends Account {

	// List some specific properties for saving
	private int safteyDepositBoxId;
	private int safteyDepositBoxKey;

	// Create constructor to initilize common properties
	public Saving(String name, String sSN, int initDeposit) {
		super(name, sSN, initDeposit);
		accountno = "2" + accountno;
		setSafteyDepositBox();
	}
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	private void setSafteyDepositBox() {
		safteyDepositBoxId = (int) (Math.random() * Math.pow(10,3));
		safteyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
	}
	// List some specific method
	public void showInfo() {
		System.out.print("Account Type : " + "Savings");
		super.showInfo();
		System.out.println(
				"safteyDepositBoxId : " + safteyDepositBoxId +
				"\nsafteyDepositBoxKey : " + safteyDepositBoxKey
				);
	}
}
