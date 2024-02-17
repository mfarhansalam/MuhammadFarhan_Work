package Task2;

public class Vehicle {
    private double speed;
    private double mileage;

    // Constructor
    public Vehicle(double speed, double mileage) {
        this.speed = speed;
        this.mileage = mileage;
    }

    // Getters and setters
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}

// Subclass Car
class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(double speed, double mileage, int numberOfDoors) {
        super(speed, mileage);
        this.numberOfDoors = numberOfDoors;
    }

    // Getter and setter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

// Subclass Bike
class Bike extends Vehicle {
    private boolean hasBasket;

    // Constructor
    public Bike(double speed, double mileage, boolean hasBasket) {
        super(speed, mileage);
        this.hasBasket = hasBasket;
    }

    // Getter and setter for hasBasket
    public boolean isHasBasket() {
        return hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }
}
