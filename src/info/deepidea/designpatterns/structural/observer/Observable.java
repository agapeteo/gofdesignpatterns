package info.deepidea.designpatterns.structural.observer;

public interface Observable {
    void addObserver(Observer newObserver);
    void removeObserver(Observer observer);
    void notifyObservers();
}
