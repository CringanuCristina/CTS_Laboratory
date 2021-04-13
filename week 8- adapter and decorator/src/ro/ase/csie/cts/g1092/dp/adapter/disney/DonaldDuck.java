package ro.ase.csie.cts.g1092.dp.adapter.disney;

public class DonaldDuck implements DisneyActions{
	String name;
	int lifePoints;

	public DonaldDuck(int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}

	@Override
	public void changeLocation(int x, int y) {
		System.out.println("is moving to new location");
		
	}

	@Override
	public void isWounded(int lostLifePoints) {
		System.out.println(
				String.format("%s took a hit of %d points", name, lostLifePoints));
		
	}

	@Override
	public void isHealing(int recoveredPoints) {
		System.out.println(
				String.format("%s took a heal of %d points", name, recoveredPoints));
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getPower() {
		// TODO Auto-generated method stub
		return this.lifePoints;
	}

}
