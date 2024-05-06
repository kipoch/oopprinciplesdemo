package org.oopfundamentals;

public class Car implements Drivable {
    private final CarModel model;

    public Car(CarModel model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model.getName() + " " + model.getModelName() + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(model.getName() + " " + model.getModelName() + " is stopping...");
    }
}