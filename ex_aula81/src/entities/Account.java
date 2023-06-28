package entities;

public class Account {

	private int accountNumber;
	private String holder;
	private double value;

	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public Account(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		newDeposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getValue() {
		return value;
	}
	
	public void newDeposit(double value) {
		this.value += value;
	}
	
	public void newWithdraw(double value) {
		this.value -= value + 5.0;
	}
	
	public String toString() {
		return String.format("account data:%n"
				+ "Account %d, "
				+ "Holder: %s, "
				+ "Balance: $ %.2f", this.accountNumber, this.holder, this.value);
	}
}
