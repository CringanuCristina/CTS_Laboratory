package ro.ase.csie.cts.g1094.singleton;

public class DBConnection {

	String connString;
	String schema;
	
	private static DBConnection connection = null;
	
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
	
	public static DBConnection getConnection() {
		if(DBConnection.connection == null) {
			connection = new DBConnection();
		}
		return DBConnection.connection;
	}
	
	//It's not clean
	//Misleading- others they think the have more connections
	public static DBConnection getConnection(String connString, String schema) {
		if(DBConnection.connection == null) {
			connection = new DBConnection(connString, schema);
		}
		return DBConnection.connection;
	}
}
