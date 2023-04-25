package interfaces;

import utils.ItemObserver;

import java.io.Serializable;

public abstract class Item extends Observer<Item> implements Serializable {
    private static final long serialVersionUID = 1L;
    protected static int count = 1; // for auto incrementing id
    protected int id;
    private String name;
    private String description;
    private String type;

    public Item(String name, String description, String type) {
        this.id = count++;
        this.name = name;
        this.description = description;
        this.type = type;
        setObservable(ItemObserver.getInstance());
        observable.subscribe(this);
    }

    public static void setCounter(int _count) {
        count = _count;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return String.format("Id: %d | Name: %s | Description: %s | Type: %s ", id, name, description, type);
    }

    public void remove() {
        observable.unsubscribe(this);
    }
}
