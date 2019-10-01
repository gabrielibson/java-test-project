import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.hotel.api.model.ClientType;
import com.thoughtworks.hotel.api.model.Hotel;
import com.thoughtworks.hotel.api.model.Reservation;
import com.thoughtworks.hotel.api.model.ReservationFactory;

public class FailingTest {

	private static List<Hotel> hotels;

	@Before
	public void initialize() {
		initializeHotels();
	}

	/*@Test
	public void testThatFails() {
		assertTrue("This should fail", false);
	}*/

	@Test
	public void checkLakewood() {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		Calendar date3 = Calendar.getInstance();

		date1.set(2009, 2, 16);
		date2.set(2009, 2, 17);
		date3.set(2009, 2, 18);

		List<Calendar> dates = Arrays.asList(date1, date2, date3);

		Reservation reservation = ReservationFactory.getInstance().createReservation(ClientType.REGULAR, dates);
		assertEquals("Lakewood", reservation.findBestHotelByReservation(hotels).getName());
	}

	@Test
	public void checkBridgewood() {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		Calendar date3 = Calendar.getInstance();

		date1.set(2009, 2, 20);
		date2.set(2009, 2, 21);
		date3.set(2009, 2, 22);

		List<Calendar> dates = Arrays.asList(date1, date2, date3);

		Reservation reservation = ReservationFactory.getInstance().createReservation(ClientType.REGULAR, dates);
		assertEquals("Bridgewood", reservation.findBestHotelByReservation(hotels).getName());
	}

	@Test
	public void checkRidgewood() {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		Calendar date3 = Calendar.getInstance();

		date1.set(2009, 2, 26);
		date2.set(2009, 2, 27);
		date3.set(2009, 2, 28);

		List<Calendar> dates = Arrays.asList(date1, date2, date3);

		Reservation reservation = ReservationFactory.getInstance().createReservation(ClientType.REWARD, dates);
		assertEquals("Ridgewood", reservation.findBestHotelByReservation(hotels).getName());
	}

	private static void initializeHotels() {
		Hotel lakewood = new Hotel("Lakewood", 3, 110.0, 90.0, 80.0, 80.0);
		Hotel bridgewood = new Hotel("Bridgewood", 4, 160.0, 60.0, 110.0, 50.0);
		Hotel ridgewood = new Hotel("Ridgewood", 5, 220.0, 150.0, 100.0, 40.0);

		hotels = new ArrayList<>();
		hotels.add(lakewood);
		hotels.add(bridgewood);
		hotels.add(ridgewood);
	}
}
