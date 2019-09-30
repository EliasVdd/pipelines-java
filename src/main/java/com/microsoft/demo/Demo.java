package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("Fristi tristi");
            return;
        }

        System.out.println("I am not covered");
    }
}