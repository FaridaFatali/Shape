package org.example;

public class Triangle extends Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void erase() {
        super.erase();
    }

    @Override
    public double calculatePerimeter() {
        perimeter = sideA + sideB + sideC;
        System.out.print("Perimeter of the triangle: ");
        return perimeter;
    }

    @Override
    public double calculateCircumference() {
        System.out.print("Triangle can't have circumference: ");
        return 0;
    }

    @Override
    public double calculateArea() {
        System.out.print("Area of the triangle can be various: ");
        return 0;
    }
}
