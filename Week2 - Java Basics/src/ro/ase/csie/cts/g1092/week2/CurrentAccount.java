package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exeptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.week2.exeptions.InsufficientFundsExeption;

public class CurrentAccount extends BankAccount {
	public static final double MAX_CREDIT = 5000;
	public CurrentAccount(String IBAN) {
		super(CurrentAccount.MAX_CREDIT,IBAN);
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;

	}

	@Override
	public void transfer(Account destination, double amount) throws InsufficientFundsExeption, IllegalTransferException  {
		if(this == destination) {
			throw new IllegalTransferException();
		}
		this.withdraw(amount);
		destination.deposit(amount);
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsExeption{
		if(amount > this.balance) {
			throw new InsufficientFundsExeption("You don't have the amount");
		}
		else {
			this.balance-= amount;
		}

	}

}
