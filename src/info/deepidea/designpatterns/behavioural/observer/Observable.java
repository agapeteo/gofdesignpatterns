package info.deepidea.designpatterns.behavioural.observer;

public interface Observable {
    void addObserver(Observer newObserver);
    void removeObserver(Observer observer);
    void notifyObservers();
}
