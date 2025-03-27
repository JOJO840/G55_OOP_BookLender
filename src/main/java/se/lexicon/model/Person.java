package se.lexicon.model;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    private static int sequencer = 0;
    private final int id;
    private String firstName;
    private String lastName;


    public Person(String firstName, String lastName) {
        this.id = getNextId();
        setFirstName(firstName);
        setLastName(lastName);
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private static int getNextId() {
        return sequencer++;
    }
        //TODO: Add exception handling
    public void loanBook(Book book) {
        if (book.isAvailable()) {
            book.setBorrower(this);
        } else {
            System.out.println("Book is not available");
        }
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        book.setBorrower(null);

    }

    public String getPersonInformation() {
        return "Text to return ";
    }
}