package ro.ase.cts.g1092.refactoring.test;

import ro.ase.cts.g1092.refactoring.phase1.SalesStrategy;
import ro.ase.cts.g1092.refactoring.phase3.ProductType;
import ro.ase.cts.g1092.refactoring.phase5.marketing.MarketingStrategyInterface;
import ro.ase.cts.g1092.refactoring.phase5.services.Marketing2021Service;
import ro.ase.cts.g1092.refactoring.phase5.services.ValidatorService;

public class TestSalesStrategy {
	public static void main(String[] args) {
		Marketing2021Service myService = new Marketing2021Service();
		ValidatorService validator = new ValidatorService();
		SalesStrategy sales = new SalesStrategy(myService,validator);
		
		try {
			float finalPrice=
					sales.ComputeFinalPrice(ProductType.DISCOUNTED, 100, 5);
					System.out.println("The final price is "+ finalPrice);
					
					sales.setMarketingStrategy(new MarketingStrategyInterface() {
						public float getFidelityDiscount(int yearsSinceRegistration) {
							return 0.5f;
					}
					});
					
					
		}
	}
}
