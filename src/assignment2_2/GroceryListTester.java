package assignment2_2;


public class GroceryListTester {

    public static void main(String[] args) {

        GroceryListManager grocery = new GroceryListManager();

        // Add grocery items
        grocery.addItem("Apples", 2.50, "Fruits", 3);
        grocery.addItem("Milk", 1.50, "Dairy", 2);
        grocery.addItem("Bread", 3.00, "Bakery", 1);
        grocery.addItem("Bananas", 2.00, "Fruits", 0);

        // Task 1: Display and check items
        grocery.displayList();

        System.out.println("Is Milk in the list? " + grocery.checkItem("Milk"));

        // Task 2: Total cost
        System.out.println();
        System.out.println("Total cost: " + grocery.calculateTotalCost() + " euros");

        // Task 3: Categories
        System.out.println();
        grocery.displayByCategory("Fruits");

        System.out.println();
        grocery.displayByCategory("Dairy");

        // Task 4: Quantity tracking
        System.out.println();
        grocery.displayAvailableItems();

        // Task 5: Test updating quantities
        System.out.println();
        System.out.println("Updating Apples quantity to 5...");

        grocery.updateQuantity("Apples", 5);

        grocery.displayAvailableItems();

        System.out.println();
        System.out.println("New total cost: " + grocery.calculateTotalCost() + " euros");

        // Test removing an item
        System.out.println();
        System.out.println("Removing Milk...");

        grocery.removeItem("Milk");

        grocery.displayList();

        System.out.println();
        System.out.println("Final total cost: " + grocery.calculateTotalCost() + " euros");
    }
}

