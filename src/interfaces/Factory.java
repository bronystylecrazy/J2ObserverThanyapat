package interfaces;

public abstract class Factory {
    protected String type;

    public Factory(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract Item create();

    @Override
    public String toString() {
        return super.toString();
    }
}
