package main.java.net.oopip.lr2.transoprtVehicle;

public class Cart extends TransportVehicle {

    private final float passengerTransportationCost = 6.5F;
    private final float cargoWeightCost = 2.5F;
    private final float slowdownCoefficientPerPassenger = 0.75F;
    private final float getSlowdownCoefficientPerCargoWeight = 0.56F;
    private final int transportationTimeMinute = 200;

    @Override
    public void setPassengerCount(int passengerCount) {
        if (passengerCount > 6 || passengerCount < 1) {
            throw new IllegalArgumentException("Passengers cannot be less than 1 or more than 5");
        }
        super.setPassengerCount(passengerCount);
    }

    @Override
    public void setCargoWeight(float cargoWeight) {
        if (cargoWeight < 0 || cargoWeight > 350) {
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
