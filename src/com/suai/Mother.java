package com.suai;

public class Mother {

    Son other;
    private String name;


    public Mother (String name){
        this.name = name;
    }

    public synchronized String getName(){
        return name;
    }

    public void setOther(Son other) {
        this.other = other;
    }

    public synchronized void say(){
        System.out.println("Mom " + this.name + " says: \"Wash the dishes!!\" to son " + other.getName());
    }
}
