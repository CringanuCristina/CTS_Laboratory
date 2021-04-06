package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.AbstractWeapon;

public class WaterBallon extends AbstractWeapon{

	public WaterBallon(String desc) {
		this.description = "A water ballon";
	}
	@Override
	public void pewPew() {
		System.out.println("Splash");
		
	}

}
