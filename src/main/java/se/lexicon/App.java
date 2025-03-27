package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion


//        // Initialize and display Book & Person instances
        Person person1 = new Person("John", "Doe");
//        Person person2 = new Person("Test", "Testsson");
//
//
//        Book book1 = new Book("Apan", "författare1");
//        Book book2 = new Book("hajen", "författare2");
//        Book book3 = new Book("Tigern", "författare3");
//
//
//        System.out.println(person1.getFirstName() + " " + person1.getLastName());
//        // Simulate borrowing a book
//        // Simulate returning a book


        Person gentrit = new Person("Gentrit", "Hoti");
        Book gentritBook = new Book("Test", "Author");

        gentrit.loanBook(gentritBook);

        System.out.println(gentritBook.isAvailable());
        System.out.println();
    }

}
