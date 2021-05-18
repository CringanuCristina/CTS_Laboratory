package ro.ase.csie.g1064.dp.observer;

public class AutoSaveModule implements NetworkStatusHandelerInterface{

	@Override
	public void connectionDown() {
		System.out.println("Create a local copy of the data...");
		
	}

	@Override
	public void connectionUp() {
		System.out.println("Reloading game data..");
		
	}

}
