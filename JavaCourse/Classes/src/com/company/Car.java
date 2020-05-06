package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String newModelName) {
        String validModel = newModelName.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore"))
            this.model = newModelName;
        else
            this.model = "Unknown";
    }

    public String getModel(){
        return this.model;
    }
}
