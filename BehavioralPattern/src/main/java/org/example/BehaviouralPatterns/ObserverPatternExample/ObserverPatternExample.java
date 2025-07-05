package org.example.BehaviouralPatterns.ObserverPatternExample;

public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayDevice displayDevice = new DisplayDevice("WaterCan");
        MobileDevice mobileDevice = new MobileDevice("SanthoshAndroid");

        weatherStation.attach(displayDevice);

        weatherStation.setTemperature(32);
        System.out.println("******************");

        weatherStation.attach(mobileDevice);

        weatherStation.setTemperature(25);
        System.out.println("******************");

        weatherStation.detach(displayDevice);
        weatherStation.setTemperature(19);
        System.out.println("******************");
    }
}
