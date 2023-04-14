public class Passenger extends Person {
    private final int numBags;
    private Flight flight = null;

    public Passenger(String name, int numBags) {
        super(name);
        this.numBags = numBags;
    }

    public int getNumBags() {
        return numBags;
    }

    public void addFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }
}
