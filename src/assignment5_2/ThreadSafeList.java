
package assignment5_2;

import java.util.ArrayList;

public class ThreadSafeList {

    private ArrayList<String> items = new ArrayList<>();

    // Add an item safely
    public synchronized void addItem(String item) {
        items.add(item);
    }

    // Remove an item safely
    public synchronized void removeItem(String item) {
        items.remove(item);
    }

    // Get the size safely
    public synchronized int getSize() {
        return items.size();
    }

    public static void main(String[] args) {

        ThreadSafeList list = new ThreadSafeList();

        // First thread adds 1000 items
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.addItem("Item " + i);
            }
        });

        // Second thread adds 1000 items
        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                list.addItem("Item " + i);
            }
        });

        thread1.start();
        thread2.start();

        // Wait until both threads finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Size after adding: " + list.getSize());

        // Remove items using another thread
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                list.removeItem("Item " + i);
            }
        });

        thread3.start();

        try {
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Size after removing: " + list.getSize());
        System.out.println("Thread-safe list test completed.");
    }
}
