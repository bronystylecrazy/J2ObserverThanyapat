package interfaces;

import interfaces.Page;

public abstract class Application {
    protected Page currentPage;
    public abstract void run() throws InterruptedException;
    public void switchPage(Page page) throws InterruptedException {
        currentPage = page;
        currentPage.display(this);
    }
}
