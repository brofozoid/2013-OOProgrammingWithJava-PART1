/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cathal
 */
public class Book {

    private final String title;
    private final String publisher;
    private final int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title() {
        return title;
    }
    
    public String publisher() {
        return publisher;
    }
    
    public int year() {
        return year;
    }
    
    @Override
    public String toString() {
        return title + ", " + publisher + ", " + year;
    }
}
