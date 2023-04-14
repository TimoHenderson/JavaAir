import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, plane.getCapacity());
    }

    @Test
    public void hasMaxCargoWeight() {
        assertEquals(250, plane.getMaxCargoWeight());
    }

    @Test
    public void hasMaxPassengerCargoWeight() {
        assertEquals(125, plane.getMaxPassengerCargoWeight(), 0.01);
    }
}
