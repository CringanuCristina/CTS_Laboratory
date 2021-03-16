package ro.ase.cts.g1092.refactoring.phase5;

import ro.ase.cts.g1092.refactoring.exceptions.InvalidPriceException;
import ro.ase.cts.g1092.refactoring.exceptions.InvalidValueException;
import ro.ase.cts.g1092.refactoring.exceptions.InvalidYearsSinceRegistration;

public interface SalesValidatorsInterface {
	
	public abstract void validatePrice(float initialPrice) throws InvalidPriceException;
	public abstract void validateYearsSinceRegistration(int accountAge) throws InvalidYearsSinceRegistration;
}
