package utils;

import interfaces.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ItemObserver extends Observable {
    private static final List<Item> ITEMS = new ArrayList<>();
    private static ItemObserver instance;

    public ItemObserver() {
        instance = this;
    }

    public static ItemObserver getInstance() {
        if (instance != null) {
            return instance;
        }
        return new ItemObserver();
    }

    public final void notifyObservers() {
        super.notifyObservers();
        Helper.writeObjectsToFile("items.dat", getObservers().toArray());
    }

    @Override
    public final synchronized void addObserver(Observer o) {
        super.addObserver(o);
        ITEMS.add((Item) o);
    }

    @Override
    public final synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
        ITEMS.remove((Item) o);
    }

    public final List<Item> getObservers() {
        return ITEMS;
    }

    public final Item getObserverById(final int id) {
        for (Item item : ITEMS) {
            if (item.getId() == id) {
                System.out.println("Found item with id: " + id);
                return item;
            }
        }
        return null;
    }
}
