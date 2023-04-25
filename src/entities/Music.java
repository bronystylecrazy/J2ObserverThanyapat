package entities;

import interfaces.Item;

public class Music extends Item {
    private static final long serialVersionUID = 1L;
    private String artist;

    public Music(String name, String description, String artist) {
        super(name, description, "music");
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

}