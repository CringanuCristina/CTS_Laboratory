package ro.ase.csie.cts.g1094.refactor.phase4;
import ro.ase.csie.cts.g1094.refactor.exeptions.InvalidValueExceptions;

public class SalesStrategy {
	MarketingStrateryInterface mkStrategy =null;
	SalesValidatorInterface validator = null;
	
	public SalesStrategy(MarketingStrategyInterface mkStrategy, SalesValidatorInterface validator) {
		if(mkStrategy == null || validator ==null) {
			throw new NullPointerException();
		}
		this.mkStrategy = mkStrategy;
		this.validator = validator;
	}
	
	void setMarketingStrategy(MarketingStrategyInterface mkStrategy) {
		if(mkStrategy == null) {
			throw new NullPointerException();
		}
		this.mkStrategy = mkStrategy;
	}
	
	public static float getPriceWithDiscount(
			float initialPrice, float discount, float fidelityDiscount) {
		
		return (initialPrice - (discount * initialPrice)) - fidelityDiscount * (initialPrice - (discount * initialPrice));
	}
	//validator.validatePrice(initialPrice);
	//validator.validatorYearsSinceRegistration;
	public float computeFinalPrice(
			ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueExceptions
	  {
		
		if(initialPrice <= 0 || yearsSinceRegistration < 0) {
			throw new InvalidValueExceptions();
		}		
		
	    float finalPrice = 0;
	    float fidelityDiscount = getFidelityDiscount(yearsSinceRegistration);
	    
	    switch(productType) {
	    case NEW:
	    	finalPrice = initialPrice;
	    	break;
	    case DISCOUNTED:
	    	finalPrice = getPriceWithDiscount(initialPrice,ProductType.DISCOUNTED.getDiscount(), fidelityDiscount);
	    	break;
	    case LIMITED_STOCK:
	    	finalPrice = getPriceWithDiscount(initialPrice,ProductType.LIMITED_STOCK.getDiscount(), fidelityDiscount);
	    	break;
	    case LEGACY:
	    	finalPrice = getPriceWithDiscount(initialPrice,ProductType.LEGACY.getDiscount(), fidelityDiscount);
	    	break;
	    default:
	    	throw new UnsupportedOperationException("Type not managed");
	    }
	    
	    return finalPrice;
	  }
}