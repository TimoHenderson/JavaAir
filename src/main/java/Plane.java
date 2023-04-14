public class Plane {
    private final PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacity() {
        return planeType.getCapacity();
    }

    public int getMaxCargoWeight() {
        return planeType.getCargoMaxWeight();
    }

    public double getMaxPassengerCargoWeight() {
        return (double) (planeType.getCargoMaxWeight()) / 2;
    }

    public String getName() {
        return planeType.getName();
    }
}
