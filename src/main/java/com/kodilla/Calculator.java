package com.kodilla;

public class Calculator {

    public double add ( double a, double b){
        System.out.println("It works :)");
        return a + b;
    }

    public double substract ( double a, double b){
        return a - b;
    }


    public static void main ( String [] args ){

        Calculator calculator = new Calculator();
        double result = calculator.add(5.9 , 2.3);
        System.out.println(result);
    }
}