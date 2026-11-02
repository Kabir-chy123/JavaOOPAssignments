
package assignment3_2;

public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electricity");
    }

    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }
}

