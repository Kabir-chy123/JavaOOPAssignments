

package assignment3_2;

public class ElectricCar extends AbstractVehicle {

    public ElectricCar() {
        super("Electric Car", "Electricity", 0.18);
    }

    public void charge() {
        System.out.println("Electric Car is charging...");
    }
}

