package ro.ase.csie.g1092;


import java.util.ArrayList;

import ro.ase.csie.g1092.Exceptions.ExceptionNegativeMinLimit;
import ro.ase.csie.g1092.Exceptions.ExceptionProductInvalidName;
import ro.ase.csie.g1092.Exceptions.ExceptionProductInvalidPriceValues;
import ro.ase.csie.g1092.Exceptions.ExceptionProductInvalidSoldItems;

/*
 * 
 * DISCLAIMER
 * Most of the given methods are implemented with bugs
 * Cele mai multe dintre metodele date au bug-uri 
 * 
 * 
 * SPECS
 * 
 * name - between 5 and 200 alpha-numeric chars (no special chars)
 * price - between [0.01, 100000)
 * soldItems - between [0, 1000]
 * 
 * 
 */

public class Product implements InterfaceProductValidations{
	private String name;
	private float price;
	private ArrayList<Integer> weeklySoldItems;		//number of items sold each week
	
	public Product(String name, float price){
		super();
		this.name = name;
		this.price = price;
		//this.weeklySoldItems = new ArrayList<Integer>();
	}

	public Product(String name, float price, ArrayList<Integer> soldItems){
		super();
		this.name = name;
		this.price = price;
		this.weeklySoldItems = new ArrayList<Integer>();
		for(Integer n: soldItems)
			this.weeklySoldItems.add(n);
	}
	
	public void setName(String name) 
			throws ExceptionProductInvalidName{
		if(this.name == null)
			throw new ExceptionProductInvalidName();
		this.name = name;
	}

	public void setPrice(float price) 
			throws ExceptionProductInvalidPriceValues{
		if(this.price == (Float) null)
			throw new ExceptionProductInvalidPriceValues();
		this.price = price;
	}

	public void setSales(ArrayList<Integer> soldItems) 
		throws ExceptionProductInvalidSoldItems {
		if(this.weeklySoldItems == null)
			throw new ExceptionProductInvalidSoldItems();
		this.weeklySoldItems = soldItems;
		
	}
	

	public String getName() {
		return this.name;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void addWeek(int soldItems) throws ExceptionProductInvalidSoldItems{
		if(soldItems < SOLDITEMS_MIN || soldItems > SOLDITEMS_MAX)
			throw new ExceptionProductInvalidSoldItems();
		weeklySoldItems.add(soldItems);
	}
	
	public int getSoldItems(int i)throws ExceptionProductInvalidSoldItems{
		if(weeklySoldItems.get(i) < SOLDITEMS_MIN ||weeklySoldItems.get(i) > SOLDITEMS_MAX )
			throw new ExceptionProductInvalidSoldItems();
		return weeklySoldItems.get(i);
	}
	
	/*
	 * 
	 * determines the number of weeks with sales above the given limit
	 * determina numarul de saptamani in care au fost vandute un numar de produse peste limita data
	 * 
	 */
	public int getNoWeeksAboveLimit(int minLimit)throws ExceptionNegativeMinLimit{
		int noWeeks = 0;
		if(minLimit < SOLDITEMS_MIN || minLimit > SOLDITEMS_MAX)
			throw new ExceptionNegativeMinLimit();
		for(int n: weeklySoldItems)
			if(n >= minLimit)
				noWeeks++;
		return noWeeks;
	}
	
	/*
	 * 
	 * determines the percentage (%) of weeks with sales under the given limit from total number of weeks
	 * determina procentul saptamanilor (din total saptamani) care au avut vanzari sub limita data
	 * 
	 */
	public int getPercentOfBadWeeks(int minLimit){
		float m = 0;
		for(int n=0; n<weeklySoldItems.size(); n++)
			if(weeklySoldItems.get(n) < minLimit)
				m ++;
		
		return (int) (100 * m / this.weeklySoldItems.size());
	}
	
	/*
	 *  
	 * determines the index of the weeks with maximum sales 
	 * (multiple weeks can have maximum sales)
	 * 
	 * determina indexul saptamanilor cu vanzari maxime 
	 * (mai multe saptamani pot avea vanzari la nivel maxim)
	 * 
	 */
	
	public ArrayList<Integer> getWeeksIndexWithMaxSales(){
		ArrayList<Integer> maxWeeks = new ArrayList<>();
		int max = 1;
		for(int i = 0; i< this.weeklySoldItems.size(); i++) {
			if(this.weeklySoldItems.get(i) >= max) {
				max = this.weeklySoldItems.get(i);
			}
		}
		for(int i = 0; i < this.weeklySoldItems.size(); i++)
			if(this.weeklySoldItems.get(i) >= max) {
				maxWeeks.add(i);
			}
		return maxWeeks;
	}
	
	@Override
	public String toString() {
		String output = this.name + " weekly sales: ";
		for(Integer n: weeklySoldItems)
			output += n + " ";
		return output;
	}	
	
	public int getMinSale() {
		int min = this.weeklySoldItems.get(0);
		for(int sale : this.weeklySoldItems) {
			if(min > sale) {
				min = sale;
			}
		}
		return min;
	}
}