import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
    }

    public int roll() {
        // create here a random number belonging to range 1-numberOfSided
        Random rollTheDice = new Random();
        int number = rollTheDice.nextInt(numberOfSides);
        return number+1;
    }
}
