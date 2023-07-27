package model;

import controller.Controller;

import java.io.IOException;

public class ToyDraw {
    Controller controller = new Controller();

    public void toyDraw () throws IOException {
        System.out.println("Test");
        controller.run();

    }
}
