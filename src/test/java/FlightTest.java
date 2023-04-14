import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    ArrayList<Pilot> pilots;
    ArrayList<CabinCrewMember> cabinCrew;
    Plane plane;

    @Before
    public void setUp() {
        pilots = new ArrayList<>();
        pilots.add(new Pilot("Dave Angel", Rank.CAPTAIN, "PI12345"));
        pilots.add(new Pilot("Sarah Cheese", Rank.COPILOT, "PI23456"));

        cabinCrew = new ArrayList<>();
        cabinCrew.add(new CabinCrewMember("Bill Oddie", Rank.FLIGHT_ATTENDANT));
        cabinCrew.add(new CabinCrewMember("Jenny Watson", Rank.FIRST_OFFICER));
        cabinCrew.add(new CabinCrewMember("Francis Ngannou", Rank.FLIGHT_ATTENDANT));

        plane = new Plane(PlaneType.CESSNA);
        Date dateTime = DateUtil.getDateTime("12-08-2023;20:00");

        flight = new Flight(pilots, cabinCrew, plane, "FR756", Airport.EDI, Airport.MLK, dateTime);
    }

    @Test
    public void hasPilots() {
        assertEquals(2, flight.getNumPilots());
    }

    @Test
    public void hasCabinCrew() {
        assertEquals(3, flight.getNumCabinCrew());
    }

    @Test
    public void hasPassengerListStartsEmpty() {
        assertEquals(0, flight.getNumPassengers());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("FR756", flight.getFlightNum());
    }

    @Test
    public void hasOrigin() {
        assertEquals(Airport.EDI, flight.getOrigin());
    }

    @Test
    public void hasDestination() {
        assertEquals(Airport.MLK, flight.getDestination());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("12-08-2023;20:00", DateUtil.toDateString(flight.getDepartureTime()));
    }

    @Test
    public void canGetNumFreeSeatsNoPassengers() {
        assertEquals(3, flight.getNumFreeSeats());
    }

    @Test
    public void canAddPassengerWhenSpaceAvailable() {
        flight.addPassenger(new Passenger("Edward Smith", 1));
        assertEquals(1, flight.getNumPassengers());
    }

    @Test
    public void canNotAddPassengerWhenNoSpaceAvailable() {
        flight.addPassenger(new Passenger("Edward Smith", 1));
        flight.addPassenger(new Passenger("Edward Smith", 1));
        flight.addPassenger(new Passenger("Edward Smith", 1));
        flight.addPassenger(new Passenger("Edward Smith", 1));
        assertEquals(3, flight.getNumPassengers());
    }

    @Test
    public void canFly() {
        String expected = "I'm flying a Cessna from Edinburgh to MLK!";
        assertEquals(expected, flight.fly());
    }

    @Test
    public void canGetHowManyBagsChecked() {
        flight.addPassenger(new Passenger("Edward Smith", 1));
        flight.addPassenger(new Passenger("Edward Smith", 2));
        flight.addPassenger(new Passenger("Edward Smith", 3));
        assertEquals(6, flight.getCheckedBaggageWeight());
    }

    @Test
    public void flightIsAddedToPassenger() {
        Passenger passenger = new Passenger("Edward Smith", 1);
        flight.addPassenger(passenger);
        assertEquals(flight, passenger.getFlight());

    }
}
