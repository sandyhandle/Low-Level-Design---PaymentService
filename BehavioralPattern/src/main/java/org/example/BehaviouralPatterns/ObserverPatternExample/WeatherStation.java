package org.example.BehaviouralPatterns.ObserverPatternExample;

import java.util.LinkedList;
import java.util.List;

public class WeatherStation implements Subject{

    private float temperature;
    private List<Observer> observerList = new LinkedList<>();

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObservers();
    }
    @Override
    public void attach(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs : observerList){
            obs.update(temperature);
        }
    }
}
