package com.exercise.springproject.domain;

public class Carowner {
    private String name;
    private String cars;
    private int obj;

    public Carowner(String n, String c, int o){
        this.name = n;
        this.cars = c;
        this.obj = o;
    }
    public int getObj() {
        return obj;
    }

    public String getCars() {
        return cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCars(String car) {
        this.cars = car;
    }

    public void setObj(int obj) {
        this.obj = obj;
    }
}
