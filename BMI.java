package com.company;

public class BMI {
    private double weight;
    private double height;
    private static double poundsToKg = 0.45359237;
    private static double inchToMetre = 0.0254;

    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight * poundsToKg;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height * inchToMetre;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI(){
        return this.getWeight()/(Math.pow(this.getHeight(), 2));
    }
}
