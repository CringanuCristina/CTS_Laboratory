package cts.Cringanu.Cristina.g1092.pattern.factory;

public class Musem extends OnlineBooking{

	public Musem(String eventName, int price) {
		super(eventName, price);
		this.eventName = eventName;
		this.price = price;
	}

	@Override
	public  void displayDescription() {
		System.out.println("Museum");
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
