
package assignment3_2;

public class Car extends AbstractVehicle {

    public Car() {
        super("Car", "Petrol", 6.5);
    }

    public String getInfo() {
        return super.getInfo() + "\nColor: Red";
    }
}



