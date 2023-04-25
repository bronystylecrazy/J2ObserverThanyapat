package pages;

import components.WelcomeRenderer;
import interfaces.Application;
import interfaces.Page;
import interfaces.Renderer;

public class WelcomePage extends Page {
    private Renderer welcomeMessage = new WelcomeRenderer();

    @Override
    public void display(Application context) throws InterruptedException {
        welcomeMessage.render();
        context.switchPage(new DisplayPage()); // Switch to DisplayPage
    }
}
