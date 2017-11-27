
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String validChars = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        Random rollTheDice = new Random();
        for (int i = 0; i < this.length; i++) {
            int confuzzling = rollTheDice.nextInt(validChars.length());
            password = password + validChars.charAt(confuzzling);
        }
        return password;
    }
}
