package entities;

public class Account {

	private int accountNumber;
	private String holder;
	private double value;
	
	public Account() {
	}

	public Account(int accountNumber, String holder, double value) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.value = value;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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

	public void setValue(double value) {
		this.value = value;
	}
	
	public void newDeposit(double value) {
		this.value += value;
	}
	
	public void newWithdraw(double value) {
		this.value -= value;
	}
	
	public String toString() {
		return String.format("account data:%n"
				+ "Account %d, "
				+ "Holder: %s, "
				+ "Balance: $ %.2f", this.accountNumber, this.holder, this.value);
	}
}
