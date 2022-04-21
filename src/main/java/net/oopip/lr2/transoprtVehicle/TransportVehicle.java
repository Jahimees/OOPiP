package main.java.net.oopip.lr2.transoprtVehicle;

public abstract class TransportVehicle {
    private float transportationTimeMinute;
    private float cost;
    private int passengerCount;
    private float cargoWeight;

    public float getTransportationTimeMinute() {
        return transportationTimeMinute;
    }

    public void setTransportationTimeMinute(float transportationTimeMinute) {
        this.transportationTimeMinute = transportationTimeMinute;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public float getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(float cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void printTimeAndCost() {
        System.out.println("\nTime: " + getTransportationTimeMinute() + "; \nCost: " + getCost() + "\n");
    }

    public abstract void calculateTimeAndCost();
}
