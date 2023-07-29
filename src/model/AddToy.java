package model;


public class AddToy {
    private final Integer idToy;
    private final String nameToy;
    private final Integer countToy;
    private final Integer frequencyToy;

    public AddToy(Integer idToy, String nameToy, Integer countToy, Integer frequencyToy) {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.countToy = countToy;
        this.frequencyToy = frequencyToy;
    }

    public Toy addToy() {
        return new Toy(this.idToy, this.nameToy, this.countToy, this.frequencyToy);
    }
}


