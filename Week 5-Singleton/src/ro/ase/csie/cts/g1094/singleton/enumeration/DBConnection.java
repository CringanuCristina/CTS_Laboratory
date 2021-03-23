package ro.ase.csie.cts.g1094.singleton.enumeration;

public enum DBConnection {
	DEV_DB;

	String connString;
	String schema;
	
	private DBConnection() {
		System.out.println("Loading settings from the conf file");
	}
	
}
