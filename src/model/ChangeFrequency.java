package model;

import controller.Controller;

import java.io.IOException;

public class ChangeFrequency {
    Controller controller = new Controller();

    public void changeFrequency() throws IOException {
        System.out.println("Test");
        controller.run();
    }
}
