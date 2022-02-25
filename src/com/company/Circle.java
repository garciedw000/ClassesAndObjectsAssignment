package com.company;

public class Circle {

    //Fields/Attributes marked private because it should be accessed only by getter and setter methods.
    private double radius;
    private String name;

    //Constructor, public "name of class" (input parameter)
    public Circle(String name, double radius){
        this.name = name;
        this.radius = radius;
    }

    //Getter method that gets the radius, return type is double, PUBLIC
    public double getRadius() {
        return this.radius;
    }

    //Setter method that sets the radius, return type is void, PUBLIC
    public void setRadius(double radius){
        this.radius = radius;
    }

    //Getter method that gets name, return type is String, PUBLIC, can't be set.
    public String getName(){
        return this.name;
    }

    public String toString(){
        String outputString = "";

        outputString += this.name;
        outputString += " ";
        outputString += "has a radius of";
        outputString += " ";
        outputString += this.radius;

        return outputString;
    }

    public double circumference(){
        return 2 * Math.PI * this.radius;
    }

    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double diameter(){
        return 2 * this.radius;
    }

}
