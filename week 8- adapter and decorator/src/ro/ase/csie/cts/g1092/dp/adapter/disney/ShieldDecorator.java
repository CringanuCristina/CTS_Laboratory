package ro.ase.csie.cts.g1092.dp.adapter.disney;

import ro.ase.csie.cts.g1092.dp.adapter.SuperHeroCharacter;

public class ShieldDecorator extends AbstractDecodor{
int shieldPower;

public ShieldDecorator(SuperHeroCharacter decoratorObject, int shiledPower) {
	super(decoratorObject);
	this.shieldPower = shiledPower;
}

}
