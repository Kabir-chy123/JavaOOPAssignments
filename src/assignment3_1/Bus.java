
package assignment3_1;

public class Bus extends Car {

    private int passengers;

    public Bus() {
        passengers = 0;
    }

    public void passengerEnter() {
        passengers = passengers + 1;
        System.out.println("One passenger entered.");
    }

    public void passengerExit() {
        if (passengers > 0) {
            passengers = passengers - 1;
            System.out.println("One passenger exited.");
        }
    }

    public void displayPassengers() {
        System.out.println("Passengers: " + passengers);
    }
}
