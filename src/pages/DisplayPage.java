package pages;

import components.ListItemsRenderer;
import interfaces.Application;
import interfaces.Page;
import interfaces.Renderer;
import utils.Helper;

public class DisplayPage extends Page {
    private Renderer listItemRenderer = new ListItemsRenderer();

    @Override
    public void display(Application context) throws InterruptedException {
        System.out.println("[0] For adding item.    [1] For removing item.   [2] Exit Program");
        listItemRenderer.render();
        while (true) {
            int choice = Helper.getIntegerInput();
            switch (choice) {
                case 0:
                    context.switchPage(new AddItemPage());
                    break;
                case 1:
                    context.switchPage(new RemoveItemPage());
                    break;
                case 2:
                    System.exit(0); // Exit program
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
