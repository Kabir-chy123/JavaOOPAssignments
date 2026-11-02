
package assignment3_2;

public class Motorcycle implements Vehicle {

    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    public String getInfo() {
        return "Type: Motorcycle\nFuel: Gasoline\nColor: Black";
    }
}

