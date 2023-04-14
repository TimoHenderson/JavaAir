import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;


    @Before
    public void setUp() {
        pilot = new Pilot("Jim Steward", Rank.CAPTAIN, "PI112345");
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasName() {
        assertEquals("Jim Steward", pilot.getName());
    }

    @Test
    public void hasLicenceNumber() {
        assertEquals("PI112345", pilot.getLicenceNum());
    }

    @Test
    public void CanFlyPlane() {
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(pilot);
        pilots.add(new Pilot("Sarah Cheese", Rank.COPILOT, "PI23456"));

        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<>();
        cabinCrew.add(new CabinCrewMember("Bill Oddie", Rank.FLIGHT_ATTENDANT));
        cabinCrew.add(new CabinCrewMember("Jenny Watson", Rank.FIRST_OFFICER));
        cabinCrew.add(new CabinCrewMember("Francis Ngannou", Rank.FLIGHT_ATTENDANT));

        Plane plane = new Plane(PlaneType.CESSNA);

        Flight flight = new Flight(pilots, cabinCrew, plane, "FR756", Airport.EDI, Airport.MLK, "8PM");
        String expected = "I'm flying a Cessna from Edinburgh to MLK!";
        assertEquals(expected, pilot.fly(flight));
    }
}