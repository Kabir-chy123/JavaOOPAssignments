package assignment2_1;



public class CoffeeMakerDriver {

    public static void main(String[] args) {

        CoffeeMaker coffee = new CoffeeMaker();

        coffee.pressOnOff();
        System.out.println("Coffee maker is on");

        coffee.setType("espresso");
        coffee.setAmount(50);

        System.out.println("Coffee type is " + coffee.getType());
        System.out.println("Coffee amount is " + coffee.getAmount() + " ml");

        coffee.pressOnOff();
        System.out.println("Coffee maker is off");

        coffee.setType("normal");
        coffee.setAmount(70);

        System.out.println("Coffee type after off: " + coffee.getType());
        System.out.println("Coffee amount after off: " + coffee.getAmount());

        coffee.pressOnOff();
        coffee.setAmount(100);

        System.out.println("Amount after setting 100: " + coffee.getAmount());
    }
}





