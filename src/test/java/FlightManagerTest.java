import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class FlightManagerTest {
    Flight flight;

    @Before
    public void setUp() {
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(new Pilot("Tom Cruise", Rank.CAPTAIN, "PI98765"));
        pilots.add(new Pilot("Sarah Cheese", Rank.COPILOT, "PI23456"));

        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<>();
        cabinCrew.add(new CabinCrewMember("Bill Oddie", Rank.FLIGHT_ATTENDANT));
        cabinCrew.add(new CabinCrewMember("Jenny Watson", Rank.FIRST_OFFICER));
        cabinCrew.add(new CabinCrewMember("Francis Ngannou", Rank.FLIGHT_ATTENDANT));

        Plane plane = new Plane(PlaneType.CESSNA);
        Date dateTime = DateUtil.getDateTime("12-08-2023;20:00");
        flight = new Flight(pilots, cabinCrew, plane, "FR756", Airport.EDI, Airport.MLK, dateTime);
        flight.addPassenger(new Passenger("Edward Smith", 1));
        flight.addPassenger(new Passenger("Edward Smith", 2));
        flight.addPassenger(new Passenger("Edward Smith", 1));
    }

    @Test
    public void calculateHoldWeightPerPassenger() {
        assertEquals(2.0, FlightManager.calculateHoldWeightPerPassenger(flight), 0.01);
    }

    @Test
    public void calculatePassengerWeightUsed() {
        assertEquals(4, FlightManager.calculatePassengerWeightUsed(flight), 0.01);
    }

    @Test
    public void passengerBaggageWeightLeft() {
        assertEquals(2, FlightManager.passengerBaggageWeightLeft(flight), 0.01);
    }
}