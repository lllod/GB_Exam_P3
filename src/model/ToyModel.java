package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToyModel {
    private final List<Toy> toys = new ArrayList<>();
    private Integer idToy;
    public List<Toy> addToy(Integer idToy, String nameToy, Integer countToy, Integer frequencyToy) {
        AddToy addToy = new AddToy(idToy, nameToy, countToy, frequencyToy);
        toys.add(addToy.addToy());
        return toys;
    }

    public List<Toy> changeFrequency() {
        boolean flag = false;
        while (!flag) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введи ID игрушки: ");
            if (in.hasNextInt()) {
                idToy =  in.nextInt();
                flag = true;
            } else {
                System.out.println("Необходимо вводить целочисленное значение от 1 до 9!");
            }
        }

        List<Integer> idList = new ArrayList<>();
        for (Toy toy: toys) {
            idList.add(toy.getIdToy());
        }
        if (idList.contains(idToy)) {
            ChangeFrequency changeFrequency = new ChangeFrequency();
            return changeFrequency.changeFrequency(idToy, toys);
        } else {
            System.out.println("Игрушки с таким ID нет!");
        }
        return toys;
    }

    public String toyDraw() {
        ToyDraw toyDraw = new ToyDraw(toys);
        return toyDraw.toyDraw();
    }
}
