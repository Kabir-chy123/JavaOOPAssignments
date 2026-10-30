package assignment2_1;


public class CoffeeMaker {

    private boolean on = false;
    private String type = "normal";
    private int amount = 10;

    public void pressOnOff() {
        on = !on;
    }

    public boolean isOn() {
        return on;
    }

    public void setType(String type) {
        if (on) {
            if (type.equals("normal") || type.equals("espresso")) {
                this.type = type;
            }
        }
    }

    public String getType() {
        return type;
    }

    public void setAmount(int amount) {
        if (on) {
            if (amount >= 10 && amount <= 80) {
                this.amount = amount;
            }
        }
    }

    public int getAmount() {
        return amount;
    }
}

