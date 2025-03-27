package se.lexicon.model;


/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion
    private String id;
    private String title;
    private String author;
    private boolean available = true;
    private Person borrower;

    public Book(String title, String author) {
        setTitle(title);
        setTitle(author);
    }

    public Book(String title, String author, Person borrower) {
        setTitle(title);
        setTitle(author);
        setBorrower(borrower);


    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBorrower(Person borrower) {
        setAvailable(false);
        this.borrower = borrower;
    }

    public Person getBorrower() {
        return borrower;
    }

    public String getBookInformation() {
        return "Text to return ";
    }
}