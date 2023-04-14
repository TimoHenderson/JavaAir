import org.junit.Before;
import org.junit.Test;

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
        assertEquals("I'm Flying!", pilot.fly());
    }
}