package pages;

import factories.MovieFactory;
import factories.MusicFactory;
import interfaces.Item;
import factories.BookFactory;
import interfaces.Factory;
import interfaces.Page;
import interfaces.Application;
import utils.Helper;
import utils.ItemObserver;

public class AddItemPage extends Page {

    public static final Factory[] TYPES = {
            new BookFactory(),
            new MovieFactory(),
            new MusicFactory(),
    };

    @Override
    public void display(Application context) throws InterruptedException {
        Helper.clearScreen();
        System.out.println("Add Item Page");
        System.out.println("[1] Add Item");
        System.out.println("[2] Back");
        int choice = Helper.getIntegerInput();
        switch (choice) {
            case 1:
                addItemHandler(context);
                break;
            case 2:
                Helper.clearScreen();
                context.switchPage(new DisplayPage());
                break;
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }

    public void addItemHandler(Application context){
        askForItemType(context);
    }

    public void askForItemType(Application context){
        Helper.clearScreen();
        System.out.println("What type of item do you want to add?");
        listItemTypes();

        try{
            int choice = Helper.getIntegerInput();
            TYPES[choice].create();
            System.out.println("Item added successfully.");
            Thread.sleep(1000);
            Helper.clearScreen();
            context.switchPage(new DisplayPage());
        }catch(Exception e){
            System.out.println("Invalid input. Please try again.");
            askForItemType(context);
        }
    }

    public void listItemTypes(){
        int index = 0;
        for(var type: TYPES) {
            System.out.printf("[%d] %s\n", index++, type.getType()); // type.getType() is the name of the type
        }
    }
}
