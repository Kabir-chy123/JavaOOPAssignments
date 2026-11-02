
package assignment3_2;

public class Car implements Vehicle {

    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public String getInfo() {
        return "Type: Car\nFuel: Petrol\nColor: Red";
    }
}

