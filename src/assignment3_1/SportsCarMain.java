
package assignment3_1;

public class SportsCarMain {

    public static void main(String[] args) {

        Car car = new Car();
        SportsCar sportsCar = new SportsCar();

        System.out.println("Normal Car:");
        car.accelerate();
        car.accelerate();
        car.display();

        System.out.println();

        System.out.println("Sports Car:");
        sportsCar.accelerate();
        sportsCar.accelerate();
        sportsCar.display();

        System.out.println();

        car.decelerate();
        sportsCar.decelerate();

        System.out.println("After braking:");

        System.out.println("Normal Car:");
        car.display();

        System.out.println("Sports Car:");
        sportsCar.display();
    }
}

