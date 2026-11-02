
package assignment3_2;

public class Motorcycle extends AbstractVehicle {

    public Motorcycle() {
        super("Motorcycle", "Gasoline");
    }

    public String getInfo() {
        return super.getInfo() + "\nColor: Black";
    }
}


