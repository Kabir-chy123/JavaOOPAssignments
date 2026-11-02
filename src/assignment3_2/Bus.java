
package assignment3_2;

public class Bus extends AbstractVehicle {

    public Bus() {
        super("Bus", "Diesel");
    }

    public String getInfo() {
        return super.getInfo() + "\nCapacity: 40 passengers";
    }
}


