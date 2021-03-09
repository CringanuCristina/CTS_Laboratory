package ro.ase.csie.cts.g1094.refactor.phase1;

public class Product {
	
	public static final int MAX_AGE_ACCOUNT = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f ;
	
	public float calculeazaPriceWithDiscount(ProductType productType, float price, int accountAge)
	  {
	    float finalPrice = 0;
	    float fidelityDiscount = (accountAge > MAX_AGE_ACCOUNT) ? (float)MAX_FIDELITY_DISCOUNT : (float)accountAge/100; 
	   
	    switch(productType) {
	    case NEW:
	    	finalPrice = price;
	    	break;
	    case DISCOUNTED:
	    	finalPrice = (price - (ProductType.DISCOUNTED.getDiscount() * price)) - fidelityDiscount * (price - (ProductType.DISCOUNTED.getDiscount() * price));
	    	break;
	    case LIMITED_STOCK:
	    	finalPrice = (price - (ProductType.LIMITED_STOCK.getDiscount() * price)) - fidelityDiscount * (price - (ProductType.LIMITED_STOCK.getDiscount() * price));
	    	break;
	    case LEGACY:
	    	finalPrice = (price - (ProductType.LEGACY.getDiscount() * price)) - fidelityDiscount * (price - (ProductType.LEGACY.getDiscount() * price));
	    	break;
	    default:
	    	throw new UnsupportedOperationException("The enum type is not covered");
	    }
	    
	    if (productType == ProductType.NEW)
	    {
	      finalPrice = price;
	    }
	    else if (productType == ProductType.DISCOUNTED)
	    {
	      finalPrice = (price - (ProductType.DISCOUNTED.getDiscount() * price)) - fidelityDiscount * (price - (ProductType.DISCOUNTED.getDiscount() * price));
	    }
	    else if (productType == ProductType.LIMITED_STOCK)
	    {
	      finalPrice = (price - (ProductType.LIMITED_STOCK.getDiscount() * price)) - fidelityDiscount * (price - (ProductType.LIMITED_STOCK.getDiscount() * price));
	    }
	    else if (productType == ProductType.LEGACY)
	    {
	      finalPrice = (price - (ProductType.LEGACY.getDiscount() * price)) - fidelityDiscount * (price - (ProductType.LEGACY.getDiscount() * price));
	    }
	    return finalPrice;
	  }
}