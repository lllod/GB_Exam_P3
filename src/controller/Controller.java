package controller;
//import model.AddToy;
//import model.ChangeFrequency;
import model.Toy;
//import model.ToyDraw;
import model.ToyModel;
import view.AddMenu;
import view.Menu;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controller {
    Logger logger = Logger.getAnonymousLogger();
    ToyModel toyModel = new ToyModel();
    public void run() throws IOException {
        Menu mainMenu = new Menu();
        String userChoice = mainMenu.mainMenu();
        switch (userChoice) {
            case "1"-> {
                AddMenu addMenu = new AddMenu();
                toyModel.addToy(addMenu.addID(),
                        addMenu.addName(),
                        addMenu.addCount(),
                        addMenu.addFrequency());
                logger.log(Level.INFO, "Игрушка успешно добавлена");
            }
            case "2"-> {
                Scanner scanner = new Scanner(System.in);
                toyModel.changeFrequency();
                logger.log(Level.INFO, "Вес игрушки успешно изменен");
            }
            case "3"-> {
                toyModel.toyDraw();
                logger.log(Level.INFO, "Розыгрыш успешно проведен");
            }
            case "4"-> {
                logger.log(Level.INFO, "Работа завершается...");
            }
            default -> {
                logger.log(Level.WARNING, "Ошибка при вводе операции!");
                this.run();
            }
        }
    }
}
