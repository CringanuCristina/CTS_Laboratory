package ro.ase.csie.g1064.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class NetworkMonitorModele {

	List<NetworkStatusHandelerInterface> module = new ArrayList<>();
	public void register(NetworkStatusHandelerInterface module) {
		this.module.add(module);
	}
	public void unregister(NetworkStatusHandelerInterface module) {
		this.module.remove(module);
	}
	public void networkStatusChanged(NetworkStatus status) {
		if(status == NetworkStatus.DOWN){
			for(NetworkStatusHandelerInterface module : module) {
				module.connectionDown();
			}
		}
		if(status == NetworkStatus.UP){
			for(NetworkStatusHandelerInterface module : module) {
				module.connectionUp();
			}
		}
	}
	
}
