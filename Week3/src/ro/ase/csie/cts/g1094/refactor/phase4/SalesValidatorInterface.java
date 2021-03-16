package ro.ase.csie.cts.g1094.refactor.phase4;

public interface SalesValidatorInterface {
	 public abstract void validPrice(float initial Price) {
		 if(initial price<= 0 ) {
			 throw new InvalidValueExceptions();
		 }
	 }
}
