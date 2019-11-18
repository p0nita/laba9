package com.suai;

public class Son {
    Mother other;
    private String name;


    public Son (String name){
        this.name = name;
    }

    public synchronized String getName(){
        return name;
    }

    public void setOther(Mother other) {
        this.other = other;
    }

    public synchronized void say(){
        System.out.println("Son " + this.name + " says \"Mom! I'm busy!\" to mom " + other.getName());
    }
}