package components;

import interfaces.Renderer;

public final class WelcomeRenderer extends Renderer {
    @Override
    public void render() throws InterruptedException {
        System.out.println("\n" +
                "    _____  __                 ______   __                 ______               __     \n" +
                "   /     |/  |               /      \\ /  |               /      \\             /  |    \n" +
                "   $$$$$ |$$/  __   __   __ /$$$$$$  |$$/  _____  ____  /$$$$$$  |  ______   _$$ |_   \n" +
                "      $$ |/  |/  | /  | /  |$$ |__$$ |/  |/     \\/    \\ $$ |__$$ | /      \\ / $$   |  \n" +
                " __   $$ |$$ |$$ | $$ | $$ |$$    $$ |$$ |$$$$$$ $$$$  |$$    $$ |/$$$$$$  |$$$$$$/   \n" +
                "/  |  $$ |$$ |$$ | $$ | $$ |$$$$$$$$ |$$ |$$ | $$ | $$ |$$$$$$$$ |$$ |  $$/   $$ | __ \n" +
                "$$ \\__$$ |$$ |$$ \\_$$ \\_$$ |$$ |  $$ |$$ |$$ | $$ | $$ |$$ |  $$ |$$ |        $$ |/  |\n" +
                "$$    $$/ $$ |$$   $$   $$/ $$ |  $$ |$$ |$$ | $$ | $$ |$$ |  $$ |$$ |        $$  $$/ \n" +
                " $$$$$$/  $$/  $$$$$/$$$$/  $$/   $$/ $$/ $$/  $$/  $$/ $$/   $$/ $$/          $$$$/  \n");
        System.out.println("Welcome to Thanyapat's application!\n"); // Welcome message
    }
}
