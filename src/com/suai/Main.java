package com.suai;

public class Main {

    public static void main(String[] args) {
        Mother mom1 = new Mother ("Alice");
        Son son1 = new Son("Bob");
        Object o = new Object();
        mom1.setOther(son1);
        son1.setOther(mom1);
        Thread wt1 = new Thread(new WorkerMother(mom1, o));
        Thread wt2 = new Thread(new WorkerSon(son1, o));
        wt1.start();
        System.out.println("thread_1 is run!");
        wt2.start();
        System.out.println("thread_2 is run!");
    }
}