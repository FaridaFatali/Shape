package org.example;

public class Rectangle extends Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;

    public Rectangle(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
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
    public double calculateArea() {
        double area = ((sideA + sideC) * (sideB + sideD)) / 4;
        System.out.print("Area of the rectangle: ");
        return area;
    }

    @Override
    public double calculateCircumference() {
        System.out.print("Rectangle can't have circumference: ");
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = sideA + sideB + sideC + sideD;
        System.out.print("Perimeter of the rectangle: ");
        return perimeter;
    }
}
