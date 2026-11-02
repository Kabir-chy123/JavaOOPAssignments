
package assignment3_2;

public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

        ElectricCar electricCar = new ElectricCar();
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle();

        System.out.println("Vehicle Demonstration");

        car.start();
        car.stop();
        System.out.println(car.getInfo());

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());

        System.out.println("\nElectric Vehicles");

        electricCar.start();
        electricCar.charge();
        electricCar.stop();
        System.out.println(electricCar.getInfo());

        electricMotorcycle.start();
        electricMotorcycle.charge();
        electricMotorcycle.stop();
        System.out.println(electricMotorcycle.getInfo());

        System.out.println("\nCharging normal car:");
        ((ElectricVehicle) car).charge();
    }
}

