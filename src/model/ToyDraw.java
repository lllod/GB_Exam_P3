package model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ToyDraw {
    private final Random random = new Random(System.currentTimeMillis());
    private final List<Toy> toys;
    private final List<Toy> drawList = new ArrayList<>();

    public ToyDraw(List<Toy> toys) {
        this.toys = toys;
    }

    public String toyDraw () {
        for (Toy value : toys) {
            int countOfElements = value.getCountToy() * value.getFrequencyToy();
            while (countOfElements-- > 0) {
                drawList.add(value);
            }
        }
        Toy drawToy;
        if (!drawList.isEmpty()) {
            int randomIndex = random.nextInt(drawList.size());
            drawToy = drawList.get(randomIndex);
            int drawToyCount = drawToy.getCountToy();
            if (drawToyCount < 2) {
                toys.remove(drawToy);
            } else {
                drawToy.setCountToy(drawToyCount - 1);
            }
            try (FileWriter fileWriter = new FileWriter("drawToys.txt", true)) {
                fileWriter.write(drawToy + "\n");
                fileWriter.flush();
            } catch (IOException e) {
                return e.getMessage();
            }
        } else {
            return "Игрушек больше нет";
        }
        return String.format("Вам выпала игрушка: %s", drawToy.getNameToy());
    }
}
