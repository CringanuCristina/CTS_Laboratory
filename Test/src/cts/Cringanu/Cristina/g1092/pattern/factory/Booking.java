package cts.Cringanu.Cristina.g1092.pattern.factory;


public class Booking {
	
	public static OnlineBooking getType(EventType type, String eventName) {
		OnlineBooking booking = null;
		switch (type) {
	case EVENT:
		booking = new Event(eventName, 1000);
		break;
	case CONCERT:
		booking = new Concert(eventName, 1000);
	case MUSEUM:
		booking = new Musem(eventName, 1000);
	default:
		throw new UnsupportedOperationException();
	}
	
	return booking;
	}
}
