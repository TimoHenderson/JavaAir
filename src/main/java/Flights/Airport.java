package Flights;

public enum Airport {
    GLA("Glasgow"),
    EDI("Edinburgh"),
    JFK("JFK"),
    MLK("MLK");

    private final String formattedString;

    Airport(String formattedString) {
        this.formattedString = formattedString;
    }

    public String getFormattedString() {
        return formattedString;
    }


}
