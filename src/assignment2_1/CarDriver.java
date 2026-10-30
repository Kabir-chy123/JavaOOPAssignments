package assignment2_1;

public class CarDriver {

    public static void main(String[] args) {

        Car myCar = new Car("Toyota", 60, 40);

        // Test 1: Normal cruise control
        myCar.fillTank();
        myCar.setTargetSpeed(80);

        if (myCar.turnCruiseOn()) {
            System.out.println("Cruise control is ON");
            System.out.println("Target speed: " + myCar.getTargetSpeed());
            System.out.println("Current speed: " + myCar.getSpeed());
        } else {
            System.out.println("Cruise control failed");
        }

        myCar.turnCruiseOff();
        System.out.println("Cruise control is OFF");

        // Test 2: Speed too high
        myCar.setTargetSpeed(150);

        if (!myCar.turnCruiseOn()) {
            System.out.println("150 km/h is not allowed");
        }

        // Test 3: Speed too low
        myCar.setTargetSpeed(20);

        if (!myCar.turnCruiseOn()) {
            System.out.println("20 km/h is not allowed");
        }

        // Test 4: Decrease speed
        myCar.setTargetSpeed(60);

        if (myCar.turnCruiseOn()) {
            System.out.println("Speed decreased to " + myCar.getSpeed());
        }

        myCar.turnCruiseOff();

        // Test 5: No gasoline
        Car emptyCar = new Car("BMW", 60, 40);

        emptyCar.setTargetSpeed(80);

        if (!emptyCar.turnCruiseOn()) {
            System.out.println("Cannot accelerate without gasoline");
        }

        System.out.println("Cruise control active: " + emptyCar.isCruiseOn());
    }
}
