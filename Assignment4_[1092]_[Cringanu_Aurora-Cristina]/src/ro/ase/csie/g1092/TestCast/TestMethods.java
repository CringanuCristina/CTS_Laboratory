package ro.ase.csie.g1092.TestCast;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.g1092.Product;
import ro.ase.csie.g1092.Exceptions.ExceptionNegativeMinLimit;
import ro.ase.csie.g1092.Exceptions.ExceptionProductInvalidSoldItems;
import ro.ase.csie.g1092.TestCast.testCategory.ImportantTest;
import ro.ase.csie.g1092.TestCast.testCategory.PerformanceTest;

public class TestMethods {
	public static final String NAME = "coffe";
	public static final float PRICE  = 5;
	public static final ArrayList<Integer> WEEKLYSOLDITEMS = new ArrayList<>();
	Product product1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		WEEKLYSOLDITEMS.add(4);
		WEEKLYSOLDITEMS.add(2);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		product1 = new Product(NAME, PRICE,WEEKLYSOLDITEMS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	//Rights
	@Category(ImportantTest.class)
	@Test
	public void testAddWeekRight() throws ExceptionProductInvalidSoldItems {
		try {
			product1.addWeek(7);
			assertEquals("week not added",
					(int)WEEKLYSOLDITEMS.get(WEEKLYSOLDITEMS.size()-1), 
					product1.getSoldItems(WEEKLYSOLDITEMS.size()-1));
		}
		catch(ExceptionProductInvalidSoldItems e) {
			fail("Constructorul a generat exceptie pentru valori OK");
		}	
	}
	@Category(ImportantTest.class)
	@Test
	public void testGetSoldItemsRight() throws ExceptionProductInvalidSoldItems {
		try {
			for(int i = 0; i < WEEKLYSOLDITEMS.size(); i++) {
				assertEquals("did not get sold items",
						(int)WEEKLYSOLDITEMS.get(i), product1.getSoldItems(i));
			}
		}
		catch(ExceptionProductInvalidSoldItems e) {
			fail("Constructorul a generat exceptie pentru valori OK");
		}	
	}
	
	@Test
	public void testGetNoWeeksAboveLimitRight() throws ExceptionProductInvalidSoldItems, ExceptionNegativeMinLimit {
		int minLimit = 3; 
		int noWeeks = 1;
		try {
			for(int i = 0; i < WEEKLYSOLDITEMS.size(); i++) {
				assertEquals("wrong noWeeks above limit",noWeeks,
				product1.getNoWeeksAboveLimit(minLimit));
			}
		}
		catch(ExceptionNegativeMinLimit e) {
			fail("negative min limit");
		}
	}
	//Boundaries
	@Test(expected = ExceptionProductInvalidSoldItems.class)
	public void testAddWeekDownBoundery() throws ExceptionProductInvalidSoldItems {	
		product1.addWeek(1001);
	}
	@Test(expected = ExceptionProductInvalidSoldItems.class)
	public void testAddWeekUpBoundery() throws ExceptionProductInvalidSoldItems {	
		product1.addWeek(-1);
	}
	@Test(expected = ExceptionProductInvalidSoldItems.class)
	public void testGetSoldItemsDownBoundery() throws ExceptionProductInvalidSoldItems {	
		ArrayList<Integer> salesOutsideRange = new ArrayList<>();
		salesOutsideRange.add(-1);
		Product product2 = new Product(NAME,PRICE,salesOutsideRange);
		product2.getSoldItems(0);
	}
	@Test(expected = ExceptionProductInvalidSoldItems.class)
	public void testGetSoldItemsUpBoundery() throws ExceptionProductInvalidSoldItems {	
		ArrayList<Integer> salesOutsideRange = new ArrayList<>();
		salesOutsideRange.add(1001);
		Product product2 = new Product(NAME,PRICE,salesOutsideRange);
		product2.getSoldItems(0);
	}
	@Test(expected = ExceptionNegativeMinLimit.class)
	public void testGetNoWeeksAboveLimitDownBoundery() throws ExceptionNegativeMinLimit {	
		product1.getNoWeeksAboveLimit(-1);
	}
	@Test(expected = ExceptionNegativeMinLimit.class)
	public void testGetNoWeeksAboveLimitUpBoundery() throws ExceptionNegativeMinLimit {	
		product1.getNoWeeksAboveLimit(1001);
	}
	
	//Ordering
	@Test
	public void testGetNoWeeksAboveLimitSortateCrescator() throws ExceptionNegativeMinLimit, ExceptionProductInvalidSoldItems {
		ArrayList<Integer> sales = 
				new ArrayList<>(Arrays.asList(5,6,7,8,9));
		product1.setSales(sales);
		
		float expectingsalesabovelimit = 5;
		float averagesales = product1.getNoWeeksAboveLimit(4);
		
		assertEquals(expectingsalesabovelimit, averagesales,0);	
	}
	
	@Test
	public void testGetNoWeeksAboveLimitSortateDescrescator() throws ExceptionNegativeMinLimit, ExceptionProductInvalidSoldItems {
		ArrayList<Integer> sales = 
				new ArrayList<>(Arrays.asList(9,8,7,6,5));
		product1.setSales(sales);
		
		float expectingsalesabovelimit = 5;
		float averagesales = product1.getNoWeeksAboveLimit(4);
		
		assertEquals(expectingsalesabovelimit, averagesales,0);	
	}
	
	//Cardinality
	@Test
	public void testGetNoWeeksAboveLimitWithNoSales() throws ExceptionNegativeMinLimit, ExceptionProductInvalidSoldItems {
		ArrayList<Integer> sales = 
				new ArrayList<>();
		product1.setSales(sales);
		
		float expectingsalesabovelimit =0 ;
		float averagesales = product1.getNoWeeksAboveLimit(4);
		
		assertEquals(expectingsalesabovelimit, averagesales,0);	
	}
	@Test
	public void testGetNoWeeksAboveLimitWithONESale() throws ExceptionNegativeMinLimit, ExceptionProductInvalidSoldItems {
		int oneSale = 0;
		ArrayList<Integer> sales = 
				new ArrayList<>();
		sales.add(oneSale);
		product1.setSales(sales);
		float expectingsalesabovelimit = oneSale;
		float averagesales = product1.getNoWeeksAboveLimit(4);
		assertEquals(expectingsalesabovelimit, averagesales,0);	
	}
	@Category(PerformanceTest.class)
	@Test(timeout = 3)
	public void testGetNoWeeksAboveLimitPerformance() throws ExceptionProductInvalidSoldItems, ExceptionNegativeMinLimit {
		ArrayList<Integer> sales = 
				new ArrayList<>();
		Product product2 = new Product(NAME,PRICE,sales);
		for(int i = 0; i < 100; i++) {
			sales.add(2);
		}
		for(int i = 0; i < 100; i++) {
			sales.add(4);
		}
		for(int i = 0; i < 100; i++) {
			sales.add(5);
		}
		for(int i = 0; i < 700; i++) {
			sales.add(3);
		}
		product2.setSales(sales);
		product2.getNoWeeksAboveLimit(4);
	}
	
}
