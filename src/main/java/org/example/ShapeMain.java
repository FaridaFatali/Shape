package org.example;

/**
 * @author Farida Fatali
 * Practice about Polymorphism and hierarcy in Java
 */

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.createShape();
        shape.draw();
        shape.erase();

        // To understand polymorphism
        System.out.println("--------------------------");
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.calculateCircumference());

        // To understand relation among the classes
        System.out.println("--------------------------");
        Canvas canvas = new Canvas();
        canvas.drawShape();
        canvas.eraseShape();
    }
}