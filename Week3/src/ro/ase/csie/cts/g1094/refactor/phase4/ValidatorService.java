package ro.ase.csie.cts.g1094.refactor.phase4;

import ro.ase.csie.cts.g1094.refactor.exeptions.InvalidPriceExeption;
import ro.ase.csie.cts.g1094.refactor.exeptions.InvalidYearsSinceRegistration;

public class ValidatorService implements SalesValidatorInterface{

	@Override
	public void validatwPrice(float initialPrice) throws InvalidPriceExeption {
		if(initialPrice <=0) {
			throw new InvalidException();
		}
		
	}

	@Override
	public void validateYearsSinceRegistration(int accountAge) throws InvalidYearsSinceRegistration {
		if(accountAge <=0) {
			throw new InvalidException();
		}
		
	}

}
