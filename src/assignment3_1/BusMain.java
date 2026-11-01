
package assignment3_1;

public class BusMain {

    public static void main(String[] args) {

        Bus bus = new Bus();

        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerEnter();

        bus.displayPassengers();

        bus.accelerate();
        bus.accelerate();

        bus.display();

        bus.passengerExit();

        bus.displayPassengers();
    }
}
