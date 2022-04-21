package main.java.net.oopip.lr2.transoprtVehicle;

public class Car extends TransportVehicle {

    private final float passengerTransportationCost = 5.5F;
    private final float cargoWeightCost = 1.5F;
    private final float slowdownCoefficientPerPassenger = 0.6F;
    private final float getSlowdownCoefficientPerCargoWeight = 0.69F;
    private final int transportationTimeMinute = 60;

    @Override
    public void setPassengerCount(int passengerCount) {
        if (passengerCount > 5 || passengerCount < 1) {
            throw new IllegalArgumentException("Passengers cannot be less than 1 or more than 5");
        }
        super.setPassengerCount(passengerCount);
    }

    @Override
    public void setCargoWeight(float cargoWeight) {
        if (cargoWeight < 0 || cargoWeight > 300) {
            throw new IllegalArgumentException("Weight of cargo cannot be less tha 0 or more than 300");
        }
        super.setCargoWeight(cargoWeight);
    }

    @Override
    public void calculateTimeAndCost() {
        if (getPassengerCount() == 0) {
            throw new IllegalArgumentException("No one passenger defined");
        }
        setCost(passengerTransportationCost * getPassengerCount() + cargoWeightCost * getCargoWeight());
        setTransportationTimeMinute(transportationTimeMinute * (slowdownCoefficientPerPassenger + getPassengerCount() * 0.1f)
                * (getSlowdownCoefficientPerCargoWeight + getCargoWeight() * 0.01f));
    }
}
