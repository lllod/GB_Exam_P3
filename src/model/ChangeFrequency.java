package model;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ChangeFrequency {

    private Integer frequencyToy;
    private boolean flag;

    public List<Toy> changeFrequency(Integer ID, List<Toy> toys) {
        for (Toy toy : toys) {
            if (Objects.equals(ID, toy.getIdToy())) {
                while (!flag) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Введите новый вес игрушки (от 1 до 9): ");
                    if (scanner.hasNextInt()) {
                        frequencyToy =  scanner.nextInt();
                        if (frequencyToy > 0 && frequencyToy < 10) {
                            flag = true;
                        } else {
                            System.out.println("Необходимо вводить целочисленное значение от 1 до 9!");
                        }
                    } else {
                        System.out.println("Необходимо вводить целочисленное значение от 1 до 9!");
                    }
                }
                toy.setFrequencyToy(frequencyToy);
            }
        }
        return toys;
    }
}
