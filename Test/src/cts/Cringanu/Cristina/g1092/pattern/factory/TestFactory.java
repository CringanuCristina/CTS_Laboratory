package cts.Cringanu.Cristina.g1092.pattern.factory;

public class TestFactory {
	public static void main(String[] args) {
		Client client1 = new Client("Client1");
		//client1.setType(new Event("Event", 1000));
		//client1.setType(new Concert("Concert",  100));

		OnlineBooking event = Booking.getType(EventType.EVENT, "Event");
		client1.setType(event);
		client1.displayDescription("Event", 1000);
		
		//OnlineBooking event1 = Booking.getType(EventType.MUSEUM, "Ms");
		//client1.setType(event1);
		//client1.displayDescription("Museum", 2000);
		//client1.setType(Booking.getType(EventType.MUSEUM, "Ms"));
	}
}
