package entities;

import interfaces.Item;

public class Book extends Item {
    private static final long serialVersionUID = 1L;
    private String author;

    public Book(String name, String description, String author) {
        super(name, description, "book");
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }
}
