package main.java.net.oopip.lr2.transoprtVehicle;

public class Bicycle extends TransportVehicle{

    private final float passengerTransportationCost = 8.5F;
    private final float cargoWeightCost = 5.5F;
    private final float slowdownCoefficientPerPassenger = 0.9F;
    private final float getSlowdownCoefficientPerCargoWeight = 0.98F;
    private final int transportationTimeMinute = 300;

    @Override
    public void setPassengerCount(int passengerCount) {
        if (passengerCount > 2 || passengerCount < 1) {
            throw new IllegalArgumentException("Passengers cannot be less than 1 or more than 5");
        }
        super.setPassengerCount(passengerCount);
    }

    @Override
    public void setCargoWeight(float cargoWeight) {
        if (cargoWeight < 0 || cargoWeight > 50) {
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
