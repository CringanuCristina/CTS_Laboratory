package cts.Cringanu.Cristina.g1092.pattern.factory;

public class Concert extends OnlineBooking{

	public Concert(String eventName, int price) {
		super(eventName, price);
		this.eventName = eventName;
		this.price = price;
	}

	@Override
	public  void displayDescription() {
		System.out.println("Concert");
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
