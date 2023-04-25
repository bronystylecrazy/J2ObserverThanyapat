import interfaces.Application;
import interfaces.Item;
import interfaces.Observable;
import pages.WelcomePage;
import utils.Helper;
import utils.ItemObserver;

import java.util.ArrayList;
import java.util.List;

public class ThanyapatApplication extends Application {
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
            item.setObservable(ov);
            items.add(item);
        }

        ov.setObservers(items);
        System.out.println(" Loaded " + items.size() + " item(s) from file.");
    }
}
