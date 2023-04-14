import org.junit.Before;
import org.junit.Test;

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
}