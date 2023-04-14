import java.util.ArrayList;

public class Flight {
    private final ArrayList<Pilot> pilots;
    private final ArrayList<CabinCrewMember> cabinCrew;
    private final ArrayList<Passenger> passengers;
    private final Plane plane;
    private final String flightNum;
    private final Airport origin;
    private final Airport destination;
    private final String departureTime;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrew, Plane plane, String flightNum, Airport origin, Airport destination, String departureTime) {
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

    public String getDepartureTime() {
        return departureTime;
    }

    public int getNumFreeSeats() {
        return plane.getCapacity() - passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (getNumFreeSeats() > 0) {
            passengers.add(passenger);
        }
    }
}
