package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight =input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height =input.nextDouble();

        BMI bmi = new BMI(weight, height);
        System.out.println("BMI is " + bmi.getBMI());

        if(bmi.getBMI() < 18.5){
            System.out.println("Underweight");
        }
        else if(bmi.getBMI() >= 18.5 && bmi.getBMI() < 25.0){
            System.out.println("Normal");
        }
        else if(bmi.getBMI() >= 25.0 && bmi.getBMI() < 30.0){
            System.out.println("Overweight");
        }
        else if(bmi.getBMI() >= 30.0){
            System.out.println("Obese");
        }
    }
}
