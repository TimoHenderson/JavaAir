public enum PlaneType {
    BOEING747(100, 250),
    AIRBUS300(200, 450),
    CESSNA(3, 5);

    private final int capacity;
    private final int cargoMaxWeight;

    PlaneType(int capacity, int cargoMaxWeight) {
        this.capacity = capacity;
        this.cargoMaxWeight = cargoMaxWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCargoMaxWeight() {
        return cargoMaxWeight;
    }
}
