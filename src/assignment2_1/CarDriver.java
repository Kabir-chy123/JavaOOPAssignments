package assignment2_1;



public class CarDriver {

    public static void main(String[] args) {

        Car myCar = new Car("Toyota", 60, 40);

        myCar.fillTank();

        System.out.println("Current speed: " + myCar.getSpeed());

        myCar.setTargetSpeed(80);

        System.out.println("Target speed: " + myCar.getTargetSpeed());

        if (myCar.turnCruiseOn()) {
            System.out.println("Cruise control is ON");
            System.out.println("New speed: " + myCar.getSpeed());
        } else {
            System.out.println("Cruise control cannot be turned on");
        }

        myCar.turnCruiseOff();
        System.out.println("Cruise control is OFF");
    }
}
