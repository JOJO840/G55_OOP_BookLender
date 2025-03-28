package se.lexicon.model;


import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
        setId(id);
        setAvailable(true);
    }

    public Book(String title, String author, Person borrower) {
        setTitle(title);
        setAuthor(author);
        setBorrower(borrower);
        setId(id);
        setAvailable(false);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = UUID.randomUUID().toString();
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
        this.borrower = borrower;
    }

    public String getBorrower() {
        return "Borrower: " + borrower.getPersonInformation() + "\n Book: ? " + getBookInformation();
    }

    public String getBookInformation() {
        return "Title: " + getTitle();
    }
}