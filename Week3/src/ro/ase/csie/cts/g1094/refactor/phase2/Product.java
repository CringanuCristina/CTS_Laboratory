package ro.ase.csie.cts.g1094.refactor.phase2;

import ro.ase.csie.cts.g1094.refactor.exeptions.InvalidAgeExeption;
import ro.ase.csie.cts.g1094.refactor.exeptions.InvalidPriceExeption;

public class Product {
	
	public static final int MAX_AGE_ACCOUNT = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f ;
	
	public static float getDiscountValue(float price, float discount) {
		return discount*price;
	}
	
	public static float getFinalPriceWithDiscountandFidelity(float price, float discountValue, float fidelityDiscount) {
		return (price-discountValue) *(1- fidelityDiscount);
	}
	
	private static float getFidelityDiscount(int accountAge) {
		return (accountAge > MAX_AGE_ACCOUNT) ? (float)MAX_FIDELITY_DISCOUNT : (float)accountAge/100; 
	}
	
	private static float getFinalPrice(float price, float fidelityDiscount, ProductType type) {
		float discountValue = getDiscountValue(price, type.getDiscount());
    	float finalPrice = getFinalPriceWithDiscountandFidelity( price,  discountValue,  0);
    	return finalPrice;
	}
	
	public float calculeazaPriceWithDiscount(ProductType productType, float price, int accountAge) throws InvalidPriceExeption, InvalidAgeExeption
	  {
		if(price <= 0 ) {
			throw new InvalidPriceExeption();
		}
		if(accountAge<0) {
			throw new InvalidAgeExeption();
		}
	    float finalPrice = 0;
	    float fidelityDiscount = (productType == ProductType.NEW)? 0: getFidelityDiscount(accountAge);
	    
	    float discountValue = 0;
	   
	    finalPrice = getFinalPrice( price,  fidelityDiscount,  ProductType.LEGACY);
	    	
	    
	    return finalPrice;
	  }
}