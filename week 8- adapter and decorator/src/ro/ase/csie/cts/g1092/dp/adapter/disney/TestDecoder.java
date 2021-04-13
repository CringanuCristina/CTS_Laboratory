package ro.ase.csie.cts.g1092.dp.adapter.disney;

import ro.ase.csie.cts.g1092.dp.adapter.FantesySuperHero;
import ro.ase.csie.cts.g1092.dp.adapter.SuperHeroCharacter;

public class TestDecoder {

	public static void main(String[] args) {
		SuperHeroCharacter fantesyHero = new FantesySuperHero("blue dragon", 1000, true);
		fantesyHero.move();
		fantesyHero.takeAHit(500);
		fantesyHero.heal(200);
		SuperHeroCharacter woundedHero = new WoundedDecorator(fantesyHero);
		woundedHero.move();

	}

}
