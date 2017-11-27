
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        double number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type a number: ");
        double number2 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        System.out.println("Division: " + number1 + " / " + number2 + " = " + (number1 / number2));
    }
}
