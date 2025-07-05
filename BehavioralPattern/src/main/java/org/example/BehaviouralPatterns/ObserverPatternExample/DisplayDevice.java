package org.example.BehaviouralPatterns.ObserverPatternExample;

public class DisplayDevice implements Observer {
    private float temperature;

    private String name;

    public DisplayDevice(String name) {
        this.name = name;
    }

    @Override
    public void update(float temp) {
        temperature = temp;
        System.out.println("Temperature on the " + name + " Display is " + temperature);
    }
}
