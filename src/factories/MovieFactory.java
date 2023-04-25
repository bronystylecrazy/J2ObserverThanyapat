package factories;

import entities.Movie;
import interfaces.Factory;
import utils.Helper;

public class MovieFactory extends Factory {

    public MovieFactory() {
        super("movie");
    }

    @Override
    public Movie create() {
        System.out.println("Enter movie name: ");
        String name = Helper.getInput();

        System.out.println("Enter movie description: ");
        String description = Helper.getInput();

        System.out.println("Enter movie author: ");
        String genre = Helper.getInput();

        return new Movie(name, description, genre);
    }

}
