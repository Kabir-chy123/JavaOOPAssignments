
package assignment3_1;

public class SportsCar extends Car {

    @Override
    public void accelerate() {
        if (gasoline >= 3) {
            speed = speed + 10;
            gasoline = gasoline - 3;
        }
    }

    @Override
    public void decelerate() {
        speed = speed - 10;

        if (speed < 0) {
            speed = 0;
        }
    }
}

