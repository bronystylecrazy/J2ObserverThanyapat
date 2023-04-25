package utils;

import interfaces.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ItemObserver extends Observable {
    private static List<Item> items = new ArrayList<>();
    private static ItemObserver instance;
    public ItemObserver(){
        instance = this;
    }

    public static ItemObserver getInstance() {
        if(instance != null) return instance;
        return new ItemObserver();
    }

    public void notifyObservers(){
        super.notifyObservers();
        Helper.writeObjectsToFile("items.dat", getObservers().toArray());
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        items.add((Item) o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
        items.remove((Item)o);
    }

    public List<Item> getObservers(){
        return items;
    }

    public Item getObserverById(int id){
        for (Item item : items) {
            if (item.getId() == id) {
                System.out.println("Found item with id: " + id);
                return item;
            }
        }
        return null;
    }
}
