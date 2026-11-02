
package assignment3_2;

public class VehicleDemo {

    public static void main(String[] args) {

        AbstractVehicle[] vehicles = {
                new Car(),
                new Motorcycle(),
                new Bus(),
                new ElectricCar(),
                new ElectricMotorcycle()
        };

        System.out.println("Vehicle Demonstration");

        for (AbstractVehicle vehicle : vehicles) {

            System.out.println();

            vehicle.start();
            vehicle.stop();

            System.out.println(vehicle.getInfo());

            if (vehicle instanceof ElectricCar ||
                    vehicle instanceof ElectricMotorcycle) {

                System.out.println("Energy consumption: "
                        + vehicle.calculateFuelEfficiency() + " kWh/km");

            } else {

                System.out.println("Fuel consumption: "
                        + vehicle.calculateFuelEfficiency() + " L/100 km");
            }

            vehicle.charge();
        }
    }
}

