package interfaces;

@Deprecated
public abstract class Observer<T extends Item> {
    protected Observable<T> observable;
//    public abstract void update();

    public void setObservable(Observable<T> observable) {
        this.observable = observable;
    }
}
