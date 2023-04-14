public class Pilot extends StaffMember {
    private final String licenceNum;

    public Pilot(String name, Rank rank, String licenceNum) {
        super(name, rank);
        this.licenceNum = licenceNum;
    }

    public String getLicenceNum() {
        return licenceNum;
    }

    public String fly(Flight flight) {
        String plane = flight.getPlane().getName();
        String origin = flight.getOrigin().getFormattedString();
        String destination = flight.getDestination().getFormattedString();

        return "I'm flying a " + plane + " from " + origin + " to " + destination + "!";
    }
}
