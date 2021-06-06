package ro.ase.csie.cts.g1092.prototype;

import java.util.ArrayList;

public class ServerInterface implements Cloneable{
	    String ipAddress;
	    int port;
	    int maxConnections;
	    boolean connect;
	    boolean disconnect;
	    ArrayList<Integer> connection = null;
	    
	    public ServerInterface(String ipAddress, int port) {
	    	System.out.println("server connect");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.connection = new ArrayList<>();
			
			System.out.println("creating connection");
			this.ipAddress = ipAddress;
			this.port = port;
			System.out.println("connection created");
	    }
	    
	    private ServerInterface() {
	    	
	    }
	    protected Object clone() throws CloneNotSupportedException{
	    	ServerInterface copy = new ServerInterface();
	    	copy.ipAddress = this.ipAddress;
	    	copy.port = this.port;
	    	return copy;
	    }
}
