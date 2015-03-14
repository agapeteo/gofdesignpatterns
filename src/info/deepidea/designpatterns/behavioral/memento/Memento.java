package info.deepidea.designpatterns.behavioral.memento;

public class Memento {
    private String personName;
    private int age;
    private double weight;

    public Memento(String personName, int age, double weight) {
        this.personName = personName;
        this.age = age;
        this.weight = weight;
    }

    public String getPersonName() {
        return personName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}