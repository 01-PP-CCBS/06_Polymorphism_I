package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        
    }

    private static void pollObj(Queen obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-----------------");
    }
        //overloading Besipiel
    private static void pollObj(Worker obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-----------------");
    }    
        //overloading Besipiel
    private static void pollObj(Drone obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-----------------");
    }        
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }




}

