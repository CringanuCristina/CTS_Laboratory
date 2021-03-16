package ro.ase.csie.cts.g1094.refactor.phase4;

import ro.ase.csie.cts.g1094.refactor.exeptions.InvalidYearsSinceRegistration;

public interface SalesValidatorInterface {
	 public abstract void validatwPrice(float initialPrice);
	public abstract void validateYearsSinceRegistration(int accountAge) throws InvalidYearsSinceRegistration;
	
}
