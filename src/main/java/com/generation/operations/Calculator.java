package com.generation.operations;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a , int b){
        return a -b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double pow(double base, double exponent){
        return Math.pow(base,exponent);
    }

    public double divide(double a, double b){
        return a / b;
    }
}
