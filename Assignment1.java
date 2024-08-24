package com.mycompany.assignment1;

public class Assignment1 {

    public static void main(String[] args) {
        System.out.println(" ***** Arithmetic Operation ***** ");
        ArithmeticOperation ar = new ArithmeticOperation(200, 70);
        System.out.println("Addition = "+ar.getAddition());
        System.out.println("Substraction = "+ar.getSubstraction());
        System.out.println("Multiplication = "+ar.getMultiplication());
        System.out.println("Division = "+ar.getDivision());

    }
}
