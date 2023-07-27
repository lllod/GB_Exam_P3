package model;
import model.AddToy;
import model.ChangeFrequency;
import model.ToyDraw;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ToyModel {
    boolean flag;
    public void addToy(Integer idToy, String nameToy, Integer countToy, Integer frequencyToy) throws IOException {
        AddToy addToy = new AddToy(idToy, nameToy, countToy, frequencyToy);
        addToy.addToy();
    }

    public void changeFrequency() throws IOException {
        flag = false;
        Scanner in = new Scanner(System.in);
        while (!flag) {
            System.out.print("Введи ID игрушки: ");
            if (in.hasNextInt()) {
                Integer idToy =  in.nextInt();
                flag = true;
            } else {
                System.out.println("Необходимо вводить целочисленное значение!");
            }
//            try {
//                Scanner in = new Scanner(System.in);
//                System.out.print("Введи ID игрушки: ");
//                Integer idToy =  in.nextInt();
//                flag = true;
//            } catch (InputMismatchException e) {
//                System.out.println("Необходимо вводить целочисленное значение!");
//            }
        }

        ChangeFrequency changeFrequency = new ChangeFrequency();
        changeFrequency.changeFrequency();
    }

    public void toyDraw() throws IOException {
        ToyDraw toyDraw = new ToyDraw();
        toyDraw.toyDraw();
    }
}
