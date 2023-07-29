package view;

import java.util.List;

public class PrintListOfToys {
    public void printToys(List toys) {
        System.out.println("--------------------");
        toys.forEach(System.out::println);
        System.out.println("--------------------");
    }
}
