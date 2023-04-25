package utils;

import interfaces.Item;
import interfaces.Observable;

public class ItemObserver extends Observable<Item> {
    private static ItemObserver instance;
    public ItemObserver(){
        instance = this;
    }

    public static ItemObserver getInstance() {
        if(instance != null) return instance;
        return new ItemObserver();
    }

    public void notifyObservers(){
        Helper.writeObjectsToFile("items.dat", getObservers().toArray());
    }
}
