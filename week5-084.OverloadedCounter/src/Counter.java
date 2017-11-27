/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cathal
 */
public class Counter {

    private int value;
    private boolean check;

    public Counter() {
        this(0, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        this.decrease(1);
    }

    public void decrease(int amount) {
        if (amount < 0) {
            return;
        }

        this.value -= amount;

        if (this.check && this.value < 0) {
            this.value = 0;
        }
    }

    public void increase(int amount) {
        if (amount < 0) {
            return;
        }
        this.value += amount;
    }
}
