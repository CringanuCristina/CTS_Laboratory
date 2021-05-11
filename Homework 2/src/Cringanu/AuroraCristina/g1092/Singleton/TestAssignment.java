package Cringanu.AuroraCristina.g1092.Singleton;

public class TestAssignment {

	public static void main(String[] args) {
		DBConnection con1 = DBConnection.getConnection();
		DBConnection con2 = DBConnection.getConnection();
	
		if (con1 ==con2) {
			System.out.println("They point to same db");
		}
	}
}