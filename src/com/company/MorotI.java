package com.company;

import javax.sound.midi.Soundbank;

    public class MorotI {

    String model;
    String color;
    boolean engineState = false;

    void startEngine(){
        if(engineState == true) //else is executed only if condition is not satisfied
            System.out.println("The engine is already on.");
        else {
            engineState = true;
            System.out.println("The engine is now on.");
        }
    }

    void showAtts(){
        System.out.println("This motorcycle is a " +color+ " " +model);
        if(engineState == true)
            System.out.println("The engine is on.");
        else System.out.println("The engine is off.");
    }
    public static void main(String[] args) {

        MorotI motor = new MorotI();
        motor.model = "Yamaha";
        motor.color = "Red";
        System.out.println("Calling showAtts...");
        motor.showAtts();
        System.out.println("----------------------------");
        System.out.println("Starting engine..." );
        motor.startEngine();
        System.out.println("-----------------------------");
        System.out.println("Calling showAtts...");
        motor.showAtts();
        System.out.println("--------------------------------");
        System.out.println("Start engine...");
        motor.startEngine();

    }

}
