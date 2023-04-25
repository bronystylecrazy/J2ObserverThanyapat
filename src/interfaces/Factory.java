package interfaces;

public abstract class Factory {
    private final String type;

    public Factory(final String type) {
        this.type = type;
    }

    public final String getType() {
        return type;
    }

    public abstract Item create();

    @Override
    public final String toString() {
        return super.toString();
    }
}
