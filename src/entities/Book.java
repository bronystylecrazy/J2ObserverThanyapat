package entities;

import interfaces.Item;

public class Book extends Item {
    private static final long serialVersionUID = 1L;
    private String author;

    public Book(final String name, final String description, final String author) {
        super(name, description, "book");
        this.author = author;
    }

    public final String getAuthor() {
        return author;
    }


    public final void setAuthor(final String author) {
        this.author = author;
    }
}
