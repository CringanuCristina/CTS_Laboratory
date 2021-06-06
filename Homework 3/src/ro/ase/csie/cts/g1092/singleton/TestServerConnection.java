package ro.ase.csie.cts.g1092.singleton;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestServerConnection {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Hi");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Bye");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Prepare the test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Clear after test");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testConnection() {
		ServerConnection expectedResult = ServerConnection.getConnection();
		ServerConnection actualResult = ServerConnection.getConnection();
		assertEquals("Check the connection", expectedResult, actualResult);
		
	}
}
