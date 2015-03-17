package info.deepidea.designpatterns.behavioral.memento;

public class PersonalData {
    private String personName;
    private int age;
    private double weight;

    public PersonalData(String personName, int age, double weight) {
        this.personName = personName;
        this.age = age;
        this.weight = weight;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Memento saveState() {
        return new Memento(personName, age, weight);
    }

    public void restoreState(Memento memento) {
        personName = memento.getPersonName();
        age = memento.getAge();
        weight = memento.getWeight();
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "personName='" + personName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
