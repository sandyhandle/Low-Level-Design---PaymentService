package org.example.BehaviouralPatterns.ObserverPatternExample;

public class MobileDevice implements Observer {
    private float temperature;

    private String name;

    public MobileDevice(String name) {
        this.name = name;
    }

    @Override
    public void update(float temp) {
        temperature = temp;
        System.out.println("Temperature on the " + name + "  mobile " + temperature);
    }
}
