package ro.ase.csie.cts.g1092.dp.adapter.disney;

import ro.ase.csie.cts.g1092.dp.adapter.SuperHeroCharacter;

public class AbstractDecodor {
	SuperHeroCharacter decoratedObject;

	public AbstractDecodor(SuperHeroCharacter decoratedObject) {
		super(decoratedObject.name,decoratedObject.power);
		
	}
	
}
