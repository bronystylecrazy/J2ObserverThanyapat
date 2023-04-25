package pages;

import components.WelcomeRenderer;
import interfaces.Application;
import interfaces.Page;
import interfaces.Renderer;

public final class WelcomePage extends Page {
    private final Renderer welcomeMessage = new WelcomeRenderer();

    @Override
    public void display(final Application context) throws InterruptedException {
        welcomeMessage.render();
        context.switchPage(new DisplayPage()); // Switch to DisplayPage
    }
}
