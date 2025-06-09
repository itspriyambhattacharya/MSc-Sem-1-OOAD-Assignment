
public class BankAccount {
	// required attributes
	private final String accno; // account number
	private final String ownerName;

	// optional attributes
	private final int balance;
	private final String branch;
	private final String accountType;

	// private constructor
	private BankAccount(Builder b) {
		this.accno = b.accno;
		this.ownerName = b.ownerName;
		this.balance = b.balance;
		this.branch = b.branch;
		this.accountType = b.accountType;
	}

	// getter method for immutability
	public String getAccno() {
		return this.accno;
	}

	public String getOwner() {
		return this.ownerName;
	}

	public int getBalance() {
		return this.balance;
	}

	public String getBranch() {
		return this.branch;
	}

	public String getAccountType() {
		return this.accountType;
	}

	// Override toString() method

	@Override
	public String toString() {
		return "\nAccount Number is " + this.accno + "\nOwner Name is " + this.ownerName + "\nBalance is " + this.balance
				+ "\nBranch is " + this.branch + "\nAccount Type is " + this.accountType;
	}

	// static Builder class

	public static class Builder {
		// required attributes
		private final String accno; // account number
		private final String ownerName;

		// optional attributes
		private int balance = 0;
		private String branch = "";
		private String accountType = "Savings";

		// public constructor for required attributes
		public Builder(String a, String owner) {
			this.accno = a;
			this.ownerName = owner;
		}

		// setter methods for optional field
		public Builder setBalance(int b) {
			this.balance = b;
			return this;
		}

		public Builder setbranch(String branch) {
			this.branch = branch;
			return this;
		}

		public Builder setAccountType(String type) {
			this.accountType = type;
			return this;
		}

		// build method to create BankAccount
		public BankAccount build() {
			return new BankAccount(this);
		}
	}
}
