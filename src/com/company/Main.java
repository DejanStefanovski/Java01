package com.company;

public class Main {

    public static void main(String[] args) {

        AdvanceCalculator calc1 = new AdvanceCalculator();
        int add = calc1.add(1, 5);
        System.out.println("1+5 = " +add);
        int subtract = calc1.subtract(5, 3);
        System.out.println("5-3 = " +subtract);

        double multiply = calc1.multiply(4 , 5);
        System.out.println("4*5 = " +multiply);

        double divide = calc1.divide(40, 5);
        System.out.println("40/5 = " +divide);
    }
}
