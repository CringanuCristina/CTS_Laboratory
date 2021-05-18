package ro.ase.csie.g1064.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		NetworkMonitorModele monitor = new NetworkMonitorModele();
		monitor.networkStatusChanged(NetworkStatus.UP);
		
		NetworkStatusHandelerInterface autosave = new AutoSaveModule();
		NetworkStatusHandelerInterface notifications = new UINotificationsModule();

		monitor.register(autosave);
		monitor.register(notifications);
		monitor.networkStatusChanged(NetworkStatus.DOWN);
		monitor.unregister(notifications);
		monitor.networkStatusChanged(NetworkStatus.UP);
		
	}

}
