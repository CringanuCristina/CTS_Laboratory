package ro.ase.csie.g1092.TestCast;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.g1092.Product;
import ro.ase.csie.g1092.Exceptions.ExceptionProductInvalidSoldItems;
import ro.ase.csie.g1092.TestCast.testCategory.ImportantTest;

public class TestMethodsMore {

	public static final String NAME = "coffe";
	public static final float PRICE  = 5;
	public static final ArrayList<Integer> WEEKLYSOLDITEMS = new ArrayList<>();
	Product product1;
	static ArrayList<Integer> performanceSales;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		WEEKLYSOLDITEMS.add(4);
		WEEKLYSOLDITEMS.add(2);
		
		Random random = new Random();
		performanceSales = new ArrayList<>();
		int noSales = (int) 1e6;
		for(int i = 0; i < noSales/2; i++) {
			performanceSales.add(4);
		}
		for(int i = 0; i < noSales/2; i++) {
			performanceSales.add(7);
		}
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
//right for getPercentOfBadWeeks
	@Category(ImportantTest.class)
	@Test
	public void testGetPercentOfBadWeeksRight() throws ExceptionProductInvalidSoldItems {
		ArrayList<Integer> sales = 
				new ArrayList<>(Arrays.asList(5,6,7,8,9));
		Product product2 = new Product(NAME,PRICE,sales);
		float expectingsalesabovelimit = 40;
		float averagesales = product2.getPercentOfBadWeeks(7);
		assertEquals(expectingsalesabovelimit, averagesales,0);	
	}
	
	//right getWeeksIndexWithMaxSales
	@Test
	public void testGetWeeksIndexWithMaxSalesRight() throws ExceptionProductInvalidSoldItems {
		ArrayList<Integer> sales = 
				new ArrayList<>(Arrays.asList(5,6,7,8,9));
		
		Product product2 = new Product(NAME,PRICE,sales);
		
		ArrayList<Integer> expectingsalesabovelimit = 
				new ArrayList<>(Arrays.asList(4));
		
		ArrayList<Integer> averagesales = product2.getWeeksIndexWithMaxSales();
		assertEquals(expectingsalesabovelimit, averagesales);	
	}
	//cross-check
	@Test
	public void testGetMinCrossCheck() throws ExceptionProductInvalidSoldItems {
		product1.setSales(performanceSales);
		
		int expectedMin = Collections.min(performanceSales);
		int computedMin = product1.getMinSale();
		
		assertEquals("Min is not correct", expectedMin, computedMin);
	}
	//inverse
	@Test
	public void testGetPercentOfBadWeeksInvers() throws ExceptionProductInvalidSoldItems  {

		product1.setSales(performanceSales);
		
		int minGrade = product1.getMinSale();
		for(int sale : performanceSales) {
			if(minGrade > sale) {
				fail("The value is not minimum");
			}
		}
		
		assertTrue(true);
	}
	
}
