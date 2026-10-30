package assignment2_2;


import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {

    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> prices = new HashMap<>();

    // Task 1
    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
        prices.remove(item);
    }

    public void displayList() {
        System.out.println("Grocery List:");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    // Task 2
    public void addItem(String item, double cost) {
        groceryList.add(item);
        prices.put(item, cost);
    }

    public double calculateTotalCost() {
        double total = 0;

        for (String item : groceryList) {
            if (prices.containsKey(item)) {
                total = total + prices.get(item);
            }
        }

        return total;
    }

    public static void main(String[] args) {

        GroceryListManager grocery = new GroceryListManager();

        grocery.addItem("Apples", 2.50);
        grocery.addItem("Milk", 1.50);
        grocery.addItem("Bread", 3.00);

        grocery.displayList();

        System.out.println("Total cost: " + grocery.calculateTotalCost() + " euros");

        System.out.println("Is Milk in the list? " + grocery.checkItem("Milk"));

        grocery.removeItem("Milk");

        System.out.println("After removing Milk:");
        grocery.displayList();

        System.out.println("New total cost: " + grocery.calculateTotalCost() + " euros");
    }
}
