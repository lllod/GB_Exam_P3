package view;
import controller.Controller;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddMenu {
    private Integer idToy;
    private Integer countToy;
    private Integer frequencyToy;
    private boolean flag;
    public Integer addID() {
        flag = false;
        while (!flag) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введи ID игрушки: ");
                idToy =  in.nextInt();
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Необходимо вводить целочисленное значение!");
            }
        }
        return idToy;
    }

    public String addName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите наименование игрушки: ");
        return in.next();
    }

    public Integer addCount() {
        flag = false;
        while (!flag) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите количество игрушек: ");
                countToy =  in.nextInt();
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Необходимо вводить целочисленное значение!");
            }
        }
        return countToy;
    }

    public Integer addFrequency() {
        flag = false;
        while (!flag) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите вес игрушки (от 1 до 9): ");
                frequencyToy =  in.nextInt();
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Необходимо вводить целочисленное значение!");
            }
        }
        return frequencyToy;
    }
}
