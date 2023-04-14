package People.Customers;

import Flights.Flight;
import People.Person;

public class Passenger extends Person {
    private final int numBags;
    private Flight flight = null;
    private int seatNum = -1;

    public Passenger(String name, int numBags) {
        super(name);
        this.numBags = numBags;
    }

    public int getNumBags() {
        return numBags;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }
}
