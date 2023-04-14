public class Pilot extends StaffMember {
    private final String licenceNum;

    public Pilot(String name, Rank rank, String licenceNum) {
        super(name, rank);
        this.licenceNum = licenceNum;
    }

    public String getLicenceNum() {
        return licenceNum;
    }

    public String fly() {
        return "I'm Flying!";
    }
}
