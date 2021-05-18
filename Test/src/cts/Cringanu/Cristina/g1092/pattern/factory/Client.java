package cts.Cringanu.Cristina.g1092.pattern.factory;


public class Client {

	String eventName;
	OnlineBooking booking;
	
	public OnlineBooking getType() {
		return booking;
	}
	public void setType(OnlineBooking booking) {
		this.booking = booking;
	}
	public Client(String eventName) {
		super();
		this.eventName = eventName;
	}
	
	public void displayDescription(String eventName, int price) {
		 System.out.println(
	                String.format("It's a %s type ticket for %s with a price of %d", 
	                		this.getType(), eventName, price));

		
	}
	

}
