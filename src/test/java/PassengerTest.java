import Flights.*;
import People.Customers.Passenger;
import People.Staff.CabinCrewMember;
import People.Staff.Pilot;
import People.Staff.Rank;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void setUp() {
        passenger = new Passenger("Fred Fudge", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Fred Fudge", passenger.getName());
    }

    @Test
    public void hasNumBags() {
        assertEquals(2, passenger.getNumBags());
    }

    @Test
    public void hasFlightIsNull() {
        assertNull(passenger.getFlight());
    }

    @Test
    public void canAddFlight() {
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(new Pilot("Arnold Clark", Rank.CAPTAIN, "PI90876"));
        pilots.add(new Pilot("Sarah Cheese", Rank.COPILOT, "PI23456"));

        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<>();
        cabinCrew.add(new CabinCrewMember("Bill Oddie", Rank.FLIGHT_ATTENDANT));
        cabinCrew.add(new CabinCrewMember("Jenny Watson", Rank.FIRST_OFFICER));
        cabinCrew.add(new CabinCrewMember("Francis Ngannou", Rank.FLIGHT_ATTENDANT));

        Plane plane = new Plane(PlaneType.CESSNA);
        Date dateTime = DateUtil.getDateTime("12-08-2023;20:00");

        Flight flight = new Flight(pilots, cabinCrew, plane, "FR756", Airport.EDI, Airport.MLK, dateTime);
        passenger.setFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }

    @Test
    public void hasSeatNumberIsMinus1() {
        assertEquals(-1, passenger.getSeatNum());
    }

    @Test
    public void canAddSeatNum() {
        passenger.setSeatNum(2);
        assertEquals(2, passenger.getSeatNum());
    }
}