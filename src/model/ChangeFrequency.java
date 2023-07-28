package model;

import controller.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ChangeFrequency {
//    Controller controller = new Controller();

    Integer frequencyToy;
    boolean flag;

    public List<Toy> changeFrequency(Integer ID, List<Toy> toys) throws IOException {
        for (Toy toy : toys) {
            if (Objects.equals(ID, toy.getIdToy())) {
                while (!flag) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Введите новый вес игрушки (от 1 до 9): ");
                    if (scanner.hasNextInt()) {
                        frequencyToy =  scanner.nextInt();
                        flag = true;
                    } else {
                        System.out.println("Необходимо вводить целочисленное значение!");
                    }
                }
                toy.setFrequencyToy(frequencyToy);
            }
        }
        return toys;
//        controller.run();
    }
}
