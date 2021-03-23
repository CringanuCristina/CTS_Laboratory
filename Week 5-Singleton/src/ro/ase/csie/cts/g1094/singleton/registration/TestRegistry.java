package ro.ase.csie.cts.g1094.singleton.registration;

public abstract class TestRegistry {

	public static void main(String[] args) {
		DBConnection con1 = DBConnection.getConnection("100.123","devDB");
		DBConnection con2 = DBConnection.getConnection("100.123","devDB");

		if(con1 == con2) {
			System.out.println("They are the same");
		}
		
		DBConnection con3 = DBConnection.getConnection("1023.23","prodDB");
		if(con2 != con3) {
			System.out.println("They are different");
		}
		DBConnection con4 = DBConnection.getConnection("89.0.0.1","prodDB");
	}

}
