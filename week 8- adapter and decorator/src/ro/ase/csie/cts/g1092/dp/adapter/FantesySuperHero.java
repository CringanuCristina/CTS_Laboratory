package ro.ase.csie.cts.g1092.dp.adapter;

public class FantesySuperHero extends SuperHeroCharacter{

	boolean canFly;
	public FantesySuperHero(String name, int power, boolean canFly) {
		super(name, power);
		this.canFly = canFly;
	}
	
	@Override
	public void move() {
		if(this.canFly) {
			System.out.println("is flying");
		}
		else {
			System.out.println("is moving fast");
		}
		
	}

	@Override
	public void crouch() {
		if(this.canFly) {
			System.out.println("not crouch");
		}
		else {
			System.out.println("is getting closer to the ground");
		}
		
	}

	@Override
	public void takeAHit(int points) {
		System.out.println(
				String.format("%s took a hit of %d points", name, points));
		this.power = power;
		
	}

	@Override
	public void heal(int points) {
		System.out.println(
				String.format("%s took a hit of %d points", name, points));
		this.power = power;
		
	}

}
