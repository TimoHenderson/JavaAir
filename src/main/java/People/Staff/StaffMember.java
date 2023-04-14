package People.Staff;

import People.Person;

public abstract class StaffMember extends Person {
    private final Rank rank;

    protected StaffMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }
}
