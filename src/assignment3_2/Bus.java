
package assignment3_2;

public class Bus implements Vehicle {

    public void start() {
        System.out.println("Bus is starting...");
    }

    public void stop() {
        System.out.println("Bus is stopping...");
    }

    public String getInfo() {
        return "Type: Bus\nFuel: Diesel\nCapacity: 40 passengers";
    }
}

