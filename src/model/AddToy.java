package model;

import controller.Controller;

import java.io.IOException;

public class AddToy {
    Controller controller = new Controller();
    Integer idToy;
    String nameToy;
    Integer countToy;
    Integer frequencyToy;

    public AddToy(Integer idToy, String nameToy, Integer countToy, Integer frequencyToy) throws IOException {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.countToy = countToy;
        this.frequencyToy = frequencyToy;
    }

    public Toy addToy() {
        return new Toy(this.idToy, this.nameToy, this.countToy, this.frequencyToy);
//        System.out.println(this.idToy + this.nameToy + this.countToy + this.frequencyToy);
//        controller.run();
    }
}


