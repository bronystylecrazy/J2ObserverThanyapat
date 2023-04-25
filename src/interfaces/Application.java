package interfaces;

public abstract class Application {
    private Page currentPage;

    public abstract void run() throws InterruptedException;

    public final void switchPage(final Page page) throws InterruptedException {
        currentPage = page;
        currentPage.display(this);
    }

    public final Page getCurrentPage() {
        return currentPage;
    }
}
