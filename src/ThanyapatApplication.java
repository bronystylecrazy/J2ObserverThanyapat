import interfaces.Application;
import interfaces.Item;
import pages.WelcomePage;
import utils.Helper;
import utils.ItemObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public final class ThanyapatApplication extends Application {
    public void run() throws InterruptedException {
        assembleResources();
        switchPage(new WelcomePage());
    }

    public void assembleResources() {
        Object[] objects = Helper.readObjectsFromFile("items.dat");
        Observable ov = ItemObserver.getInstance();
        if (objects == null || objects.length == 0) {
            System.out.println(" No item(s) were loaded..");
            return; // No items in file
        }

        List<Item> items = new ArrayList<>();
        int lastId = ((Item) objects[objects.length - 1]).getId(); // Get last id
        Item.setCounter(lastId + 1);
        for (var obj : objects) {
            Item item = (Item) obj;
            ov.addObserver(item);
            items.add(item);
        }
        System.out.println(" Loaded " + items.size() + " item(s) from file.");
    }
}
