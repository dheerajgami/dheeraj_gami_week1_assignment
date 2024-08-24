package com.mycompany.assignment1.evenoddoperation;

import java.util.Scanner;

public class EvenOddOperation {

    public static void main(String[] args) {
        System.out.println(" ***** Even Odd Operation ***** ");
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println(" Enter the Number ");
        number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("The Enter Number is Even...");
        }
        else{
            System.out.println("The Enter Number is Odd...");
        }

    }
    
}
