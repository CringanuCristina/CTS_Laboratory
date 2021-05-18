package ro.ase.csie.g1064.dp.observer;

public class UINotificationsModule implements NetworkStatusHandelerInterface{

	@Override
	public void connectionDown() {
		System.out.println("Alert: connection lost");
		
	}

	@Override
	public void connectionUp() {
		System.out.println("Alert: let's get back to the game");
		
	}

}
