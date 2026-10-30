package assignment2_2;


import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {

    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> prices = new HashMap<>();
    private HashMap<String, String> categories = new HashMap<>();
    private HashMap<String, Integer> quantities = new HashMap<>();

    // Task 1
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

    // Task 2
    public void addItem(String item, double cost) {
        addItem(item);
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

    // Task 3
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

    // Task 4
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

    public static void main(String[] args) {

        GroceryListManager grocery = new GroceryListManager();

        grocery.addItem("Apples", 2.50, "Fruits", 3);
        grocery.addItem("Milk", 1.50, "Dairy", 2);
        grocery.addItem("Bread", 3.00, "Bakery", 1);
        grocery.addItem("Bananas", 2.00, "Fruits", 0);

        // Task 1
        grocery.displayList();
        System.out.println("Is Milk in the list? " + grocery.checkItem("Milk"));

        // Task 2
        System.out.println("Total cost: " + grocery.calculateTotalCost() + " euros");

        // Task 3
        grocery.displayByCategory("Fruits");

        // Task 4
        grocery.displayAvailableItems();

        System.out.println("Updating Apples quantity to 5...");
        grocery.updateQuantity("Apples", 5);

        grocery.displayAvailableItems();
    }
}


