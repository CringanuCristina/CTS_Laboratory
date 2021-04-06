package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.Bazooka;
import ro.ase.csie.cts.g1092.dp.simplefactory.MachineGun;
import ro.ase.csie.cts.g1092.dp.simplefactory.Pistol;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponsFactory;

public class RealWeaponsFactory extends AbstractWeaponsFactory{
	public AbstractWeapon getWeapon(WeaponType type, String desc) {
		AbstractWeapon weapon = null;
		switch (type) {
		case PISTOL:
			weapon = new Pistol(desc, 100);
			break;
		case MACHINEGUN:
			weapon = new MachineGun(desc, 500,1000);
		case BAZOOKA:
			weapon = new Bazooka(desc);
		default:
			throw new UnsupportedOperationException();
		}
		
		return weapon;
	}
}