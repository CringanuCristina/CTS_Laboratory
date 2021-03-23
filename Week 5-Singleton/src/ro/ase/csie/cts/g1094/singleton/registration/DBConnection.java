package ro.ase.csie.cts.g1094.singleton.registration;

import java.util.Hashtable;

public class DBConnection {
	String connString;
	String schema;
	
	private static Hashtable<String,DBConnection> connections = new Hashtable<>();

	private DBConnection() {
		System.out.println("Creating a connection object");
		System.out.println("Loading configuration...");
		this.connString= "100.123";
		this.schema = "cts";
	}
	
	private DBConnection(String connString, String schema) {
		super();
		this.connString = connString;
		this.schema = schema;
	}
	
	public static DBConnection getConnection(String connString, String schema) {
		DBConnection connection = connections.get(connString);
		if(connection == null) {
			connection = new DBConnection(connString, schema);
			connections.put(connString, connection);
		}
		return connection;
	}


	
}
