package ro.ase.csie.cts.g1092.singleton;


public class ServerConnection {
	String ipAddress;
	int port;
	static int connections;
	static int maxConnections = 1;
	public static ServerConnection connection = null;
	private ServerConnection(){
		this.ipAddress = "100.23";
		this.port = 123;
		this.connections =0;
	}
	private ServerConnection(String ipAddress, int port) {
		super();
		this.ipAddress = ipAddress;
		this.port = port;
		this.connections ++;
	}
	public static ServerConnection getConnection() {
		if(ServerConnection.connection == null) {
				connection = new ServerConnection();
		}
		return ServerConnection.connection;
	}
}
