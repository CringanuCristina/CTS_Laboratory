package ro.ase.csie.g1064.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
		SuperHero superman = new SuperHero("Superman",500, "Fly");
		SuperHeroMemento autosave1 = superman.save();
		
		superman.name = "Batman";
		System.out.println("Hero name is:" + superman.name);

	}

}
