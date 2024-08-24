package com.mycompany.assignment1.calculatoroperation;

import java.util.Scanner;

public class CalulatorOperation {

    public static void main(String[] args) {
        System.out.println(" ***** Calculator Operation ***** ");
        char operator;
        double number1,number2,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a operator : +,-,*,or /");
        operator = input.next().charAt(0);
        
        System.out.println("Enter the first number = ");
        number1 = input.nextDouble();
        
        System.out.println("Enter the second number = ");
        number2 = input.nextDouble();
        
        switch (operator) {
           // Addition Operation perform...
            case '+':
                result = number1 + number2;
                System.out.println(number1+ " + " +number2 +" = "+result);
                break;
            
            // Substraction Operation perform...
            case '-':
                result = number1 - number2;
                System.out.println(number1+ " - " +number2 +" = "+result);
                break;
            
            // Multiplication Operation perform...
            case '*':
                result = number1 * number2;
                System.out.println(number1+ " * " +number2 +" = "+result);
                break;
            
            // Division Operation perform...    
            case '/':
                result = number1 / number2;
                System.out.println(number1+ " / " +number2 +" = "+result);
                break;
            
            default:
                System.out.println("Invalid Operator...");
        }
        input.close();

    }
    
}
