package assignment2_1;




public class Car {

    private double speed;
    private double gasolineLevel;
    private double tankCapacity;
    private String typeName;

    private double targetSpeed;
    private boolean cruiseOn = false;

    public Car(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
        tankCapacity = 100;
    }

    public Car(String typeName, double tankCapacity, double speed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.speed = speed;
        gasolineLevel = 0;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed = speed + 10;
        }
    }

    public void decelerate(int amount) {
        speed = speed - amount;

        if (speed < 0) {
            speed = 0;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = tankCapacity;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    // Cruise control

    public void setTargetSpeed(double target) {
        targetSpeed = target;
    }

    public double getTargetSpeed() {
        return targetSpeed;
    }

    public boolean turnCruiseOn() {

        if (targetSpeed < 30 || targetSpeed > 120) {
            cruiseOn = false;
            return false;
        }

        if (gasolineLevel <= 0 && speed < targetSpeed) {
            cruiseOn = false;
            return false;
        }

        cruiseOn = true;

        while (speed < targetSpeed) {
            speed = speed + 1;
        }

        while (speed > targetSpeed) {
            speed = speed - 1;
        }

        return true;
    }

    public void turnCruiseOff() {
        cruiseOn = false;
    }
}

