package org.example;

// To create messages for created random shapes

public class Canvas {
    public void drawShape() {
        int i = (int) (4 * Math.random());

        switch (i) {
            case 1 -> System.out.println("The circle has been drawn.");
            case 2 -> System.out.println("The rectangle has been drawn.");
            case 3 -> System.out.println("The square has been drawn.");
            case 4 -> System.out.println("The triangle has been drawn.");
        }
    }

    public void eraseShape() {
        int i = (int) (4 * Math.random());

        switch (i) {
            case 1 -> System.out.println("The circle has been erased.");
            case 2 -> System.out.println("The rectangle has been erased.");
            case 3 -> System.out.println("The square has been erased.");
            case 4 -> System.out.println("The triangle has been erased.");
        }
    }
}
