package entities;

import interfaces.Item;

public class Movie extends Item {
    private static final long serialVersionUID = 1L;
    private String genre;

    public Movie(String name, String description, String genre) {
        super(name, description, "movie");
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
