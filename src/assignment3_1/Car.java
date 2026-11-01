
package assignment3_1;

public class Car {

    protected double speed;
    protected double gasoline;

    public Car() {
        speed = 0;
        gasoline = 100;
    }

    public void accelerate() {
        if (gasoline > 0) {
            speed = speed + 5;
            gasoline = gasoline - 1;
        }
    }

    public void decelerate() {
        speed = speed - 5;

        if (speed < 0) {
            speed = 0;
        }
    }

    public void display() {
        System.out.println("Speed: " + speed);
        System.out.println("Gasoline: " + gasoline);
    }
}

