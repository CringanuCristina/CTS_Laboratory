package ro.ase.csie.cts.g1094.singleton.staticref;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DBConnection con1 = DBConnection.connection;
		DBConnection con2 = DBConnection.connection;
		if(con1==con2) {
			System.out.println("They are the same");
		}
	}

}
