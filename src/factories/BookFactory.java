package factories;

import entities.Book;
import interfaces.Factory;
import utils.Helper;

public class BookFactory extends Factory {

    public BookFactory() {
        super("book");
    }

    @Override
    public Book create() {
        System.out.println("Enter book name: ");
        String name = Helper.getInput();

        System.out.println("Enter book description: ");
        String description = Helper.getInput();

        System.out.println("Enter book author: ");
        String author = Helper.getInput();

        return new Book(name, description, author);
    }
}
