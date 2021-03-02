package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exeptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.week2.exeptions.InsufficientFundsExeption;

public abstract class Account {
	public abstract double getBalance();
	public abstract void deposit(double amount);
	public abstract void transfer(Account destination, double amount) throws InsufficientFundsExeption, IllegalTransferException;
	public abstract void withdraw(double amount) throws InsufficientFundsExeption;
}
