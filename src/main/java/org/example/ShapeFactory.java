package org.example;

// To create random shapes

public class ShapeFactory {
    public Shape createShape() {
        Shape shape = null;
        int i = (int) (4 * Math.random());

        switch (i) {
            case 1 -> shape = new Circle(12, 24);
            case 2 -> shape = new Rectangle(12, 14, 10, 13);
            case 3 -> shape = new Square(20);
            case 4 -> shape = new Triangle(10, 12, 15);
        }

        return shape;
    }
}
