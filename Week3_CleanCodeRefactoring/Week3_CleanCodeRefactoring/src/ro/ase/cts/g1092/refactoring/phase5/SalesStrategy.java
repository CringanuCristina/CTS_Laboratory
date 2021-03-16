package ro.ase.cts.g1092.refactoring.phase5;

import ro.ase.cts.g1092.refactoring.exceptions.InvalidPriceException;
import ro.ase.cts.g1092.refactoring.exceptions.InvalidValueException;
import ro.ase.cts.g1092.refactoring.exceptions.InvalidYearsSinceRegistration;
import ro.ase.cts.g1092.refactoring.phase5.marketing.MarketingStrategyInterface;

public class SalesStrategy {
	
	private MarketingStrategyInterface myStrategy = null;
	private SalesValidatorsInterface validator = null;
	
	public SalesStrategy(MarketingStrategyInterface myStrategy, SalesValidatorsInterface validator) {
		if(myStrategy==null|validator==null) {
			throw new NullPointerException();
		}
		this.myStrategy=myStrategy;
		this.validator=validator;
	}
	
	//optional - depends on your design specs
	//allowing the change at runtime of the marketing strategy
	void setMarketingStrategy(MarketingStrategyInterface myStrategy) {
		if(myStrategy==null) {
			throw new NullPointerException();
		}
		this.myStrategy=myStrategy;
		
	}
	
	public static float getPriceWithDiscount(
			float initialPrice, float discount, float fidelityDiscount) {
		
		float initialDiscount=initialPrice - (discount * initialPrice);
		return initialDiscount * (1- fidelityDiscount);
	}
	
	public float computeFinalPrice(
			ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException, InvalidPriceException, InvalidYearsSinceRegistration
	  {		
		
		validator.validatePrice(initialPrice);
		validator.validateYearsSinceRegistration(yearsSinceRegistration);
	    
		float finalPrice = 0;
	    float fidelityDiscount = 
	    			(productType != ProductType.NEW) ? MarketingStrategyInterface.getFidelityDiscount(yearsSinceRegistration) : 0;
	  
	    finalPrice=getPriceWithDiscount(initialPrice, productType.getDiscount(), fidelityDiscount);
	    
	    return finalPrice;
	   
	  }
}