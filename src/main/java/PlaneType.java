public enum PlaneType {
    BOEING747(100, 250, "Boeing 747"),
    AIRBUS300(200, 450, "Airbus 300"),
    CESSNA(3, 5, "Cessna");

    private final int capacity;
    private final int cargoMaxWeight;


    private final String name;

    PlaneType(int capacity, int cargoMaxWeight, String name) {
        this.capacity = capacity;
        this.cargoMaxWeight = cargoMaxWeight;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCargoMaxWeight() {
        return cargoMaxWeight;
    }

    public String getName() {
        return name;
    }
}
