package Flights;

import People.Customers.Passenger;
import People.Staff.CabinCrewMember;
import People.Staff.Pilot;

import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private final ArrayList<Pilot> pilots;
    private final ArrayList<CabinCrewMember> cabinCrew;
    private final ArrayList<Passenger> passengers;
    private final Plane plane;
    private final String flightNum;
    private final Airport origin;
    private final Airport destination;
    private final Date departureTime;
    private final ArrayList<Integer> bookedSeats = new ArrayList<>();

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrew, Plane plane, String flightNum, Airport origin, Airport destination, Date departureTime) {
        this.pilots = pilots;
        this.cabinCrew = cabinCrew;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public int getNumPilots() {
        return pilots.size();
    }

    public int getNumCabinCrew() {
        return cabinCrew.size();
    }

    public int getNumPassengers() {
        return passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public Airport getOrigin() {
        return origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public int getNumFreeSeats() {
        return plane.getCapacity() - passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (getNumFreeSeats() > 0) {
            passenger.setFlight(this);
            passenger.setSeatNum(getSeatNum());
            passengers.add(passenger);
        }
    }

    public String fly() {
        return pilots.get(0).fly(this);
    }

    public int getCheckedBaggageWeight() {
        return passengers.stream()
                .reduce(0,
                        (total, passenger) -> total + passenger.getNumBags(),
                        Integer::sum);
    }

    private int getSeatNum() {
        int seatNum = 0;
        while (seatNum == 0 || bookedSeats.contains(seatNum)) {
            seatNum = (int) (Math.random() * (plane.getCapacity()) + 1);
        }
        bookedSeats.add(seatNum);
        return seatNum;
    }
}
