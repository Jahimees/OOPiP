package main.java.net.oopip.lr2.passengerCarrier;

public abstract class PassengerCarrier {
    private int speed;
    private float cost;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 1 || speed > 1000) {
            throw new IllegalArgumentException("Speed cannot be less than 1 or more than 1000");
        }
        this.speed = speed;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost < 1 || cost > 1000) {
            throw new IllegalArgumentException("Cost cannot be less than 1 and more than 1000");
        }
        this.cost = cost;
    }

    public void calculateTimeAndCost(int distanceKm) {
        System.out.println("Distance: " + distanceKm + "\n");
        System.out.println("Cost: " + getCost() * distanceKm + "\n");
        System.out.println("Time: " + (float)distanceKm/getSpeed() + " hour's\n\n");
    }

}
