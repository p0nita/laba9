package com.suai;

public class WorkerSon implements Runnable{
    Son son;
    Object o;

    public WorkerSon(Son s, Object o){
        son = s;
        this.o = o;
    }

    public void run(){
        for (int i = 0; i < 50; i++)
            son.say();
    }
}