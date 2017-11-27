
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        while (true) {
            System.out.println("name: ");
            String studentName = reader.nextLine();
            if (studentName.isEmpty()) {
                break;
            }
            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();
            Student newbie = new Student(studentName, studentNumber);
            students.add(newbie);
        }
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("Give search term: ");
        String whosit = reader.nextLine();
        System.out.println("Result: ");

        for (Student student : students) {
            if (student.getName().contains(whosit)) {
                System.out.println(student.toString());
            }
        }
    }
}
