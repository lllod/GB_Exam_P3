package model;

import controller.Controller;

import java.io.IOException;

public class AddToy {
    Controller controller = new Controller();
    Integer idToy;
    String nameToy;
    Integer countToy;
    Integer frequencyToy;

    public AddToy(Integer idToy, String nameToy, Integer countToy, Integer frequencyToy) {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.countToy = countToy;
        this.frequencyToy = frequencyToy;
    }

    public void addToy() throws IOException {
        System.out.println(this.idToy + this.nameToy + this.countToy + this.frequencyToy);
        controller.run();
    }
}


