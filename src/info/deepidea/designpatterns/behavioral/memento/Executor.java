package info.deepidea.designpatterns.behavioral.memento;

public class Executor {
    public static void main(String[] args) {
        PersonalData personalData = new PersonalData("Petia", 36, 78);
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
