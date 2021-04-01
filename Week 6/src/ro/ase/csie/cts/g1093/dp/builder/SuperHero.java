package ro.ase.csie.cts.g1093.dp.builder;

public class SuperHero {

	private String name;
	private int lifePoints;
	
	private boolean isVillan;
	private boolean isWounded;
	
	private WeaponInterface rightWeapon;
	private WeaponInterface leftWeapon;
	
	private SuperPowerInterface superPower;
	private SuperPowerInterface superSuperPower;
	
	public SuperHero() {
		
	}

	public SuperHero(
			String name, 
			int lifePoints,
			boolean isVillan,
			boolean isWounded,
			WeaponInterface rightWeapon,
			WeaponInterface leftWeapon, 
			SuperPowerInterface superPower,
			SuperPowerInterface superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillan = isVillan;
		this.isWounded = isWounded;
		this.rightWeapon = rightWeapon;
		this.leftWeapon = leftWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
}
