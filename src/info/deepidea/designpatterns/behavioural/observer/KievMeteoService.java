package info.deepidea.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class KievMeteoService implements Observable {
    private float temperature;
    private List<Observer> observers;

    public KievMeteoService(float temperature) {
        this.temperature = temperature;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer eachObserver : observers) {
            eachObserver.update(temperature);
        }
    }

    public void setTemperature(float updatedMeteoData) {
        temperature = updatedMeteoData;
        notifyObservers();
    }
}
