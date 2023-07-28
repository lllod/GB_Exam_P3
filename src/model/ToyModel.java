package model;
import model.AddToy;
import model.ChangeFrequency;
import model.ToyDraw;


import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ToyModel {
    boolean flag;
    List<Toy> toys = new ArrayList<>();
    List<Toy> drawList = new ArrayList<>();
    Integer idToy;
    public List<Toy> addToy(Integer idToy, String nameToy, Integer countToy, Integer frequencyToy) throws IOException {
        AddToy addToy = new AddToy(idToy, nameToy, countToy, frequencyToy);
        toys.add(addToy.addToy());
        return toys;
//        Toy toy = addToy.addToy();
    }

    public List<Toy> changeFrequency() throws IOException {
        flag = false;
        Scanner in = new Scanner(System.in);
        while (!flag) {
            System.out.print("Введи ID игрушки: ");
            if (in.hasNextInt()) {
                idToy =  in.nextInt();
                flag = true;
            } else {
                System.out.println("Необходимо вводить целочисленное значение!");
            }
        }

        List<Integer> idList = new ArrayList<>();
        for (Toy toy: toys) {
            idList.add(toy.getIdToy());
        }
        if (idList.contains(idToy)) {
            ChangeFrequency changeFrequency = new ChangeFrequency();
            System.out.println("Все ок");
            return changeFrequency.changeFrequency(idToy, toys);
        } else {
            System.out.println("Игрушки с таким ID нет!");
        }
        return toys;
    }

    public String toyDraw() throws IOException {
        ToyDraw toyDraw = new ToyDraw(toys);
        toyDraw.toyDraw();


        return "0";
    }
}
