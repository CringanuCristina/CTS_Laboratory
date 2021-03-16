package ro.ase.cts.g1092.refactoring.phase2;

public enum ProductType {
	NEW(0), DISCOUNT(0.1f), LIMITED_STOCK(0.25f), LEGACY(0.35f);
	
	private float discount;
	
	private ProductType(float discountValue) {
		this.discount=discountValue;
	}
	
//no default constr in order to force everyone to give the value of the discount
	
	public float getDiscount() {
		return this.discount;
	}
	
}
