package view;

import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);


    public String mainMenu() {

        System.out.println("Что делаем?\n--------------------");
        System.out.println("""
                1: Добавить игрушку
                2: Изменить вес игрушки
                3: Розыгрыш
                4: Показать список игрушек
                5: Закончить работу""");
        return in.next();



    }
}
