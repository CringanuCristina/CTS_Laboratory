package ro.ase.csie.cts.g1092.dp.adapter;

import java.util.ArrayList;

import ro.ase.csie.cts.g1092.dp.adapter.disney.DisneyActions;
import ro.ase.csie.cts.g1092.dp.adapter.disney.DonaldDuck;

public class TestAdapter {

	public static void main(String[] args) {
		SuperHeroCharacter fantesyHero = new FantesySuperHero("blue dragon", 1000, true);
		fantesyHero.move();
		fantesyHero.takeAHit(500);
		fantesyHero.heal(200);
		
		DisneyActions donald = new DonaldDuck(500);
		donald.changeLocation(100, 500);
		donald.isWounded(100);
		donald.isHealing(90);
		
		ArrayList<SuperHeroCharacter> gameHeros =  new ArrayList<>();
		gameHeros.add(fantesyHero);
		
		Disney2SuperHeroAdapter donaldAdapter = new Disney2SuperHeroAdapter(donald);
		gameHeros.add(donaldAdapter);
		
		System.out.println("-----------------");
		
		for(SuperHeroCharacter hero : gameHeros) {
			hero.crouch();
			hero.takeAHit(50);
			hero.heal(50);
		}
	}

}
