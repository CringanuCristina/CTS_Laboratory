package ro.ase.csie.cts.g1094.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		//DBConnection con1 = new DBConnection();
		//...
		//DBConnection con2 = new DBConnection();
		
		
		//DBConnection con1 = new DBConnection("100.123", "idk");
		//DBConnection con2 = new DBConnection("100.123", "idk");

		DBConnection con1 = DBConnection.getConnection();
		DBConnection con2 = DBConnection.getConnection();

		//DBConnection con1 = DBConnection.getConnection("100.123", "cts");
		//DBConnection con2 = DBConnection.getConnection("100.123", "cts");
		
		//DBConnection con3 = DBConnection.getConnection("10.0.0.0.123", "productionDB");
		
		if (con1 ==con2) {
			System.out.println("They point to same db");
		}
	}

}
