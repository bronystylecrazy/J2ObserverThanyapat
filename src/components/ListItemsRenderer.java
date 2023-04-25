package components;

import interfaces.Item;
import interfaces.Renderer;
import utils.Helper;
import utils.ItemObserver;

import java.util.List;

public class ListItemsRenderer extends Renderer {
    @Override
    public void render() {
        List<Item> items =  ItemObserver.getInstance().getObservers();


        if(items.size() == 0){
            System.out.println("No items found.");
            return;
        }
        String leftAlignFormat = "| %-3d| %-10s| %-20s | %-30s |%n";
        System.out.format("+----+-----------+----------------------+--------------------------------+%n");
        System.out.format("|                Now, we have item in a file for %03d item(s)             |%n", items.size());
        System.out.format("+----+-----------+----------------------+--------------------------------+%n");
        System.out.format("| ID | Type      | Name                 | Description                    |%n");
        System.out.format("+----+-----------+----------------------+--------------------------------+%n");



        for (var item : items) {
            System.out.format(leftAlignFormat, item.getId(), Helper.limit(item.getType(),10), Helper.limit(item.getName(),20), Helper.limit(item.getDescription(),30));
        }
        System.out.format("+----+-----------+----------------------+--------------------------------+%n");
    }
}
