package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion


//        // Initialize and display Book & Person instances
        Person person1 = new Person("Josip", "Jovanovic");
        Person person2 = new Person("Gentrit", "Hoti");

        Book book1 = new Book("Apan", "Disney");
        // person2 loans book through constructor
        Book book2 = new Book("hajen", "Disney", person2);
        Book book3 = new Book("Tiger", "Disney", person2);
        System.out.println(book1.getBookInformation());
        System.out.println(book2.getBookInformation());
        System.out.println(book3.getBookInformation());

        System.out.println("is book1 available: " + book1.isAvailable());
        System.out.println("is book2 available: " + book2.isAvailable());
        System.out.println("is book3 available: " + book2.isAvailable());
        //person1 loans book through instance
        person1.loanBook(book1);
        // check book availability
        System.out.println("is book1 available: " + book1.isAvailable());

        System.out.println(book1.getBorrower()); //get name of borrower
        System.out.println();
        System.out.println(book2.getBorrower()); //get name of borrower
        System.out.println();

        System.out.println(book3.getBorrower()); //get name of borrower

        //person1.returnBook(book1);
        System.out.println("is book1 available: " + book1.isAvailable());

    }

}
