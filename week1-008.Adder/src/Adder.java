
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type a number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        System.out.println("Sum of the numbers: " + (number1 + number2));
    }
}
