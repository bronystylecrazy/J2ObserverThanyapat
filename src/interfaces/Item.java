package interfaces;

import utils.ItemObserver;

import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

public abstract class Item implements Serializable, Observer {
    private static final long serialVersionUID = 1L;
    protected static int count = 1; // for auto incrementing id
    private final String name;
    private final String type;
    private int id;
    private String description;

    public Item(final String name, final String description, final String type) {
        this.id = count++;
        this.name = name;
        this.description = description;
        this.type = type;
        ItemObserver.getInstance().addObserver(this);
    }

    public static void setCounter(final int newCount) {
        count = newCount;
    }

    public final String getName() {
        return name;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(final String description) {
        this.description = description;
    }

    public final String getType() {
        return type;
    }

    public final int getId() {
        return id;
    }

    public final void setId(final int id) {
        this.id = id;
    }

    public final String toString() {
        return String.format("Id: %d | Name: %s | Description: %s | Type: %s ", id, name, description, type);
    }

    public final void remove() {
        ItemObserver.getInstance().deleteObserver(this);
    }

    @Override
    public void update(final Observable observable, final Object o) {

    }
}
