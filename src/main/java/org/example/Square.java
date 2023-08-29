package org.example;

public class Square extends Shape {
    protected double side;

    public Square(double side) {
        this.side = side;
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
        area = Math.pow(side, 2);
        System.out.print("The area of the square: ");
        return area;
    }

    @Override
    public double calculateCircumference() {
        System.out.print("Square can't have circumference: ");
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 4 * side;
        System.out.print("Perimeter of the square: ");
        return perimeter;
    }
}
