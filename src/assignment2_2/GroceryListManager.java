
package assignment2_2;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {

    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> prices = new HashMap<>();
    private HashMap<String, String> categories = new HashMap<>();
    private HashMap<String, Integer> quantities = new HashMap<>();

    // Task 1: Grocery List

    public void addItem(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
        }
    }

    public void removeItem(String item) {
        groceryList.remove(item);
        prices.remove(item);
        categories.remove(item);
        quantities.remove(item);
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

    // Task 2: Total Cost

    public void addItem(String item, double cost) {
        addItem(item);
        prices.put(item, cost);
    }

    public double calculateTotalCost() {
        double total = 0;

        for (String item : groceryList) {
            if (prices.containsKey(item)) {

                int quantity = 1;

                if (quantities.containsKey(item)) {
                    quantity = quantities.get(item);
                }

                total = total + prices.get(item) * quantity;
            }
        }

        return total;
    }

    // Task 3: Categories

    public void addItem(String item, double cost, String category) {
        addItem(item, cost);
        categories.put(item, category);
    }

    public void displayByCategory(String category) {
        System.out.println("Category: " + category);

        for (String item : groceryList) {
            if (category.equals(categories.get(item))) {
                System.out.println(item);
            }
        }
    }

    // Task 4: Quantities

    public void addItem(String item, double cost, String category, int quantity) {
        if (quantity >= 0) {
            addItem(item, cost, category);
            quantities.put(item, quantity);
        }
    }

    public void updateQuantity(String item, int newQuantity) {
        if (groceryList.contains(item) && newQuantity >= 0) {
            quantities.put(item, newQuantity);
        }
    }

    public void displayAvailableItems() {
        System.out.println("Available items:");

        for (String item : groceryList) {
            if (quantities.containsKey(item) && quantities.get(item) > 0) {
                System.out.println(item + " - Quantity: " + quantities.get(item));
            }
        }
    }
}


