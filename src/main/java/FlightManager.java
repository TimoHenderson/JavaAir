public class FlightManager {
    
    public static double calculateHoldWeightPerPassenger(Flight flight) {
        Plane plane = flight.getPlane();
        double weightForPassengerLuggage = plane.getMaxPassengerCargoWeight();
        int capacity = plane.getCapacity();
        return weightForPassengerLuggage / capacity;
    }

    public static int calculatePassengerWeightUsed(Flight flight) {
        return flight.getCheckedBaggageWeight();
    }

    public static double passengerBaggageWeightLeft(Flight flight) {
        int passengerBaggageWeightUsed = flight.getCheckedBaggageWeight();
        double passengerBaggageWeightLimit = flight.getPlane().getMaxPassengerCargoWeight();
        return passengerBaggageWeightLimit - passengerBaggageWeightUsed;
    }
}
