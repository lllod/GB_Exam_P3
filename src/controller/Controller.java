package controller;


import model.Toy;
import model.ToyModel;
//import view.AddMenu;
//import view.Menu;
import model.ToyID;
import view.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controller {
    private final Logger logger = Logger.getAnonymousLogger();
    private final ToyModel toyModel = new ToyModel();
    private List<Toy> toys = new ArrayList<>();
    private final FileHandler fileHandler = new FileHandler("log.txt", true);
    private final ToyID toyID = new ToyID();
    private final PrintListOfToys printListOfToys = new PrintListOfToys();
    private final PrintResultOfDrawToys printResultOfDrawToys = new PrintResultOfDrawToys();

    public Controller() throws IOException {
    }

    public void run() {
        Menu mainMenu = new Menu();
        String userChoice = mainMenu.mainMenu();
        logger.addHandler(fileHandler);
        switch (userChoice) {
            case "1"-> {
                AddMenu addMenu = new AddMenu();
                toyID.increment();
                toys = toyModel.addToy(toyID.getId(),
                        addMenu.addName(),
                        addMenu.addCount(),
                        addMenu.addFrequency());
                logger.log(Level.INFO, "Игрушка успешно добавлена");
                this.run();
            }
            case "2"-> {
                toys = toyModel.changeFrequency();
                logger.log(Level.INFO, "Вес игрушки успешно изменен");
                this.run();
            }
            case "3"-> {
                printResultOfDrawToys.printResult(toyModel.toyDraw());
                logger.log(Level.INFO, "Розыгрыш успешно проведен");
                this.run();
            }
            case "4"-> {
                printListOfToys.printToys(toys);
                this.run();
            }
            case "5"-> {
                logger.log(Level.INFO, "Работа завершается...");
            }
            default -> {
                logger.log(Level.WARNING, "Ошибка при вводе операции!");
                this.run();
            }
        }
    }
}
