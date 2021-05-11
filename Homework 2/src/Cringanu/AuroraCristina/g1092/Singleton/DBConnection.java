package Cringanu.AuroraCristina.g1092.Singleton;

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
}