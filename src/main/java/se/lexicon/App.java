package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion


//        // Initialize and display Book & Person instances
        Person person1 = new Person("Josip", "Jovanovic");
        Person person2 = new Person("Gentrit", "Hoti");

        //person1 loans book through instance
        Book book1 = new Book("Apan", "Disney");
        person1.loanBook(book1);
        // person2 loans book through constructor
        Book book2 = new Book("hajen", "Disney", person2);
        Book book3 = new Book("Tiger", "Disney", person2);

        // check book availability
        System.out.println("Book1: \t" + book1.getBookInformation() + "\n" + "is it available? : " + book1.isAvailable());
        System.out.println();
        System.out.println("Book2: \t" + book2.getBookInformation() + "\n" + "is it available? : " + book2.isAvailable());
        System.out.println();
        System.out.println("Book3: \t" + book3.getBookInformation() + "\n" + "is it available? : " + book3.isAvailable());
        System.out.println();
        System.out.println(book1.getBorrower());
        System.out.println();
        // Return a book
        person1.returnBook(book1);
        System.out.println("Book1: \t" + book1.getBookInformation() + "\n" + "is it available? : " + book1.isAvailable());
        System.out.println();
        person1.loanBook(book3); //book not available




    }

}
