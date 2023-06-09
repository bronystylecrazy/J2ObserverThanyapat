package interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T extends Item> {
    protected List<T> observers = new ArrayList<>();

    protected static Observable instance;
    public Observable(){
        instance = this;
    }

    public void subscribe(T observer){
        observers.add(observer);
        notifyObservers();
    }

    public void unsubscribe(T observer){
        observers.remove(observer);
        notifyObservers();
    }

    public void notifyObservers(){ }

    public List<T> getObservers(){
        return observers;
    }
    public void setObservers(List<T> observers){
        this.observers = observers;
    }

    public T getObserverById(int id){
        for (T item : observers) {
            if (item.getId() == id) {
                System.out.println("Found item with id: " + id);
                return item;
            }
        }
        return null;
    }
}
