package com.suai;

public class WorkerMother implements Runnable {

    Mother mom;
    Object o;

    public WorkerMother(Mother m, Object o){
        mom = m;
        this.o = o;
    }

    public void run(){
        for (int i = 0; i < 50; i++)
            mom.say();
    }
}