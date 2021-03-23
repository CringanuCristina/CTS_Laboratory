package ro.ase.csie.cts.g1094.singleton.staticref;

public class DBConnection {
	String connString;
	String schema;
	//eager-instanciation
	public final static DBConnection connection = new DBConnection();
	//static class initializer
	static {
		//called only once before the class is loaded by the JM
		System.out.println("Hello, DB loaded");
		connection.connString = "100.123";
		connection.schema = "tempData";
	}
	{
		System.out.println("Bulding obj");
	}
	
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
	
	
}
