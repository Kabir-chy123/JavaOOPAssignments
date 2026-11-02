
package assignment3_2;

public class Motorcycle extends AbstractVehicle {

    public Motorcycle() {
        super("Motorcycle", "Gasoline", 3.5);
    }

    public String getInfo() {
        return super.getInfo() + "\nColor: Black";
    }
}
