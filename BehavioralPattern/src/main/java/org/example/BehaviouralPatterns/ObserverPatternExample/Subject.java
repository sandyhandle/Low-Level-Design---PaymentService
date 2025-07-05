package org.example.BehaviouralPatterns.ObserverPatternExample;

public interface Subject {
    void attach(Observer obs);
    void detach(Observer obs);
    void notifyObservers();
}
