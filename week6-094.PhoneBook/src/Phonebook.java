/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cathal
 */
import java.util.ArrayList;

public class Phonebook {
    
    private final ArrayList<Person> people = new ArrayList<Person>();
    
    public void add(String name, String number) {
        Person person = new Person(name, number);
        this.people.add(person);
    }
    
    public void printAll() {
        for (Person person : people) {
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name) {
        for (Person person : people) {
            if (name.equals(person.getName())) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
