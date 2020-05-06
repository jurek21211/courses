package com.company;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders, wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;

        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }


    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("Engine started");
    }

    public void accelerate() {
        System.out.println("Car accelerates");
    }

    public void brake() {
        System.out.println("Car slows down");
    }

}

class Mercedes extends Car {
    public Mercedes(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate(){
        System.out.println("Mercedes accelerates");
    }
}

class BMW extends Car {
    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void brake(){
        System.out.println("BMW slows down");
    }
}

class Audi extends Car {
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("Audi ignition");
    }
}
