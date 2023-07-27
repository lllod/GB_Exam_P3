package view;

import controller.Controller;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {
    Controller controller = new Controller();
    Scanner in = new Scanner(System.in);


    public String mainMenu() throws IOException {
        FileHandler fileHandler = new FileHandler("log.txt", true);
        System.out.println("Что делаем?\n--------------------");
        System.out.println("1: Добавить игрушку\n2: Изменить вес игрушки\n3: Розыгрыш\n4: Закончить работу");
//        String operation = in.next();
        return in.next();



    }
}
