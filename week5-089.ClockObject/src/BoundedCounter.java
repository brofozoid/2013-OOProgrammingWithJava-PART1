
public class BoundedCounter {
 
    private int value;
    private int upperLimit;
 
    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
 
    public void next() {
        value++;
        if (value > upperLimit) {
            value = 0;
        }
    }
 
    public String toString() {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }
 
    public int getValue() {
        // write here code that returns the value
        return value;
    }
     
    public void setValue (int newValue) {
        if (newValue < 0) {
            return;
        }
        if (newValue > upperLimit) {
            return;
        }
        value = newValue;
    }
}
