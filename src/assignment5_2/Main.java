
package assignment5_2;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater(10);

        // Create 15 customers
        Thread[] customers = new Thread[15];

        for (int i = 0; i < customers.length; i++) {

            int customerId = i + 1;
            int tickets = (int) (Math.random() * 4) + 1;

            customers[i] = new Thread(() -> {
                theater.reserveTickets(customerId, tickets);
            });

            customers[i].start();
        }

        // Wait for all customers
        for (Thread customer : customers) {
            try {
                customer.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Remaining seats: " + theater.getAvailableSeats());
        System.out.println("Reservation completed.");
    }
}

// Theater class to manage ticket reservations
class Theater {

    private int availableSeats;

    public Theater(int seats) {
        availableSeats = seats;
    }

    // Only one customer can reserve at a time
    public synchronized void reserveTickets(int customerId, int tickets) {

        if (tickets <= availableSeats) {
            availableSeats -= tickets;

            System.out.println("Customer " + customerId +
                    " reserved " + tickets + " tickets.");
        } else {
            System.out.println("Customer " + customerId +
                    " couldn't reserve " + tickets + " tickets.");
        }
    }

    public synchronized int getAvailableSeats() {
        return availableSeats;
    }
}
