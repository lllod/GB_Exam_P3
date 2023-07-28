package controller;
//import model.AddToy;
//import model.ChangeFrequency;
import model.Toy;
//import model.ToyDraw;
import model.ToyModel;
import view.AddMenu;
import view.Menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controller {
    Logger logger = Logger.getAnonymousLogger();
    ToyModel toyModel = new ToyModel();
    List<Toy> toys = new ArrayList<>();
    FileHandler fileHandler = new FileHandler("log.txt", true);

    public Controller() throws IOException {
    }

    public void run() throws IOException {
        Menu mainMenu = new Menu();
        String userChoice = mainMenu.mainMenu();
        logger.addHandler(fileHandler);
        switch (userChoice) {
            case "1"-> {
                AddMenu addMenu = new AddMenu();
                toys = toyModel.addToy(addMenu.addID(),
                        addMenu.addName(),
                        addMenu.addCount(),
                        addMenu.addFrequency());
                toys.forEach(System.out::println);
                logger.log(Level.INFO, "Игрушка успешно добавлена");
                this.run();
            }
            case "2"-> {
                toys = toyModel.changeFrequency();
                toys.forEach(System.out::println);
                logger.log(Level.INFO, "Вес игрушки успешно изменен");
                this.run();
            }
            case "3"-> {
                System.out.println(toyModel.toyDraw());
                logger.log(Level.INFO, "Розыгрыш успешно проведен");
                this.run();
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
