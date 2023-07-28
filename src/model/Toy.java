package model;

public class Toy {
    private Integer idToy;
    private String nameToy;
    private Integer countToy;
    private Integer frequencyToy;

    public Toy(Integer idToy, String nameToy, Integer countToy, Integer frequencyToy) {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.countToy = countToy;
        this.frequencyToy = frequencyToy;
    }

    public Integer getIdToy() {
        return idToy;
    }

    public void setIdToy(Integer idToy) {
        this.idToy = idToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    public Integer getCountToy() {
        return countToy;
    }

    public void setCountToy(Integer countToy) {
        this.countToy = countToy;
    }

    public Integer getFrequencyToy() {
        return frequencyToy;
    }

    public void setFrequencyToy(Integer frequencyToy) {
        this.frequencyToy = frequencyToy;
    }

    @Override
    public String toString() {
        return String.format("№%d: %s | Вероятность выпадения: %d | Количество: %d",
                idToy, nameToy, frequencyToy, countToy);
    }
}
