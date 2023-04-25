package factories;

import entities.Music;
import interfaces.Factory;
import utils.Helper;

public class MusicFactory extends Factory {

    public MusicFactory() {
        super("music");
    }

    @Override
    public Music create() {
        System.out.println("Enter music title: ");
        String name = Helper.getInput();

        System.out.println("Enter music description: ");
        String description = Helper.getInput();

        System.out.println("Enter artist name: ");
        String artist = Helper.getInput();

        return new Music(name, description, artist);
    }
}
