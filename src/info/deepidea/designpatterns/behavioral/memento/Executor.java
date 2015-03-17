package info.deepidea.designpatterns.behavioral.memento;

public class Executor {
    public static void main(String[] args) {
        final String personName = "Petia";
        final int age = 36;
        final int weight = 78;
        PersonalData personalData = new PersonalData(personName, age, weight);
        PersonalDataCaretaker personalDataCaretaker = new PersonalDataCaretaker();

        System.out.println(personalData.toString());
        personalDataCaretaker.setMemento(personalData.saveState());

        personalData.setPersonName("Vasia");
        personalData.setAge(23);
        personalData.setWeight(90);
        System.out.println(personalData.toString());

        personalData.restoreState(personalDataCaretaker.getMemento());
        System.out.println(personalData.toString());
    }
}
