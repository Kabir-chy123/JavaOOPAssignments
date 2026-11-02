
package assignment3_2;

public class Car extends AbstractVehicle {

    public Car() {
        super("Car", "Petrol");
    }

    public String getInfo() {
        return super.getInfo() + "\nColor: Red";
    }
}


