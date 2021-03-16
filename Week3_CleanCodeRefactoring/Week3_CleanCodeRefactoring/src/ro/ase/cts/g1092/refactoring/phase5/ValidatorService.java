package ro.ase.cts.g1092.refactoring.phase5;

import ro.ase.cts.g1092.refactoring.exceptions.InvalidPriceException;
import ro.ase.cts.g1092.refactoring.exceptions.InvalidYearsSinceRegistration;

public class ValidatorService implements SalesValidatorsInterface{

	@Override
	public void validatePrice(float initialPrice) throws InvalidPriceException {
		if (initialPrice<=0) {
			throw new InvalidPriceException();
		}
		
	}

	@Override
	public void validateYearsSinceRegistration(int accountAge) throws InvalidYearsSinceRegistration {
		if(accountAge<0) {
			throw new InvalidYearsSinceRegistration();
		}
		
	}
	
}
