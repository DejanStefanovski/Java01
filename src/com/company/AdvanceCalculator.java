package com.company;

public class AdvanceCalculator extends BasicCalculator {
    @Override
    public int subtract(int a, int b){
        return b-a;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double divide(double a, double b){
        return a/b;
    }
}
