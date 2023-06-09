import People.Staff.CabinCrewMember;
import People.Staff.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CabinCrewMemberTest {
    CabinCrewMember crewMember;

    @Before
    public void setUp() {
        crewMember = new CabinCrewMember("Jim Steward", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, crewMember.getRank());
    }

    @Test
    public void hasName() {
        assertEquals("Jim Steward", crewMember.getName());
    }

    @Test
    public void canRelayMessage() {
        assertEquals("All Passengers please Sit Down", crewMember.relayMessage("Sit Down"));
    }
}