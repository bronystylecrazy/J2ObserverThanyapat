package pages;

import components.ListItemsRenderer;
import interfaces.Application;
import interfaces.Item;
import interfaces.Page;
import interfaces.Renderer;
import utils.Helper;
import utils.ItemObserver;

public final class RemoveItemPage extends Page {
    private final Renderer listItemRenderer = new ListItemsRenderer();

    @Override
    public void display(Application context) throws InterruptedException {
        Helper.clearScreen();
        System.out.println("Which item do you want to remove?");
        listItemRenderer.render();
        System.out.println("[0] Back");
        int choice = Helper.getIntegerInput();
        if (choice == 0) {
            Helper.clearScreen();
            context.switchPage(new DisplayPage());
        } else {
            try {
                Item item = ItemObserver.getInstance().getObserverById(choice);
                item.remove();
                System.out.println("Item removed successfully.");
                Helper.clearScreen();
                context.switchPage(new RemoveItemPage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Invalid input. Please try again.");
                display(context);
            } finally {
                Helper.clearScreen();
            }
        }
    }
}
