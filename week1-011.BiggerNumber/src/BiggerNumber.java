
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("The bigger number of tyhe two numbers given was: " 
        + Math.max(number2, number1));
    }
}
