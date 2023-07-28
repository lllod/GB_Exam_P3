package model;

import model.Toy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class ToyDraw {
    private final Random random = new Random(System.currentTimeMillis());
    private final List<Toy> toys;
    private final List<Toy> drawList = new ArrayList<>();

    public ToyDraw(List<Toy> toys) {
        this.toys = toys;
    }

    public void toyDraw () {
        for (Toy value : toys) {
            int countOfElements = value.getCountToy() * value.getFrequencyToy();
            while (countOfElements-- > 0) {
                drawList.add(value);
            }
        }
        System.out.println("***********************************************************************");
        System.out.println("Размер drawList");
        System.out.println(drawList.size());
        int randomIndex = random.nextInt(drawList.size());
        System.out.println("***********************************************************************");
        System.out.println("Получение индекса и Toy из drawList по индексу:");
        System.out.println(randomIndex);
        System.out.println(drawList.get(randomIndex));
        System.out.println("***********************************************************************");
        System.out.println("Получение ID игрушки из drawList по индексу");
        System.out.println(drawList.get(randomIndex).getIdToy());
        int getID = drawList.get(randomIndex).getIdToy() - 1;
        System.out.println("***********************************************************************");
        System.out.println("Получение Toy из toys по ID");
        System.out.println(toys.get(getID));
        Toy getToy = toys.get(getID);
        System.out.println("***********************************************************************");
        System.out.println("Получение count игрушки");
        System.out.println(getToy.getCountToy());
        int getCount = getToy.getCountToy();
        if (getCount < 2) {
            toys.remove(getToy);
        } else {
            getToy.setCountToy(getCount - 1);
        }
        System.out.println(getToy);

    }
}
