package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 5;

        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();
        boolean square = rectangle.isSquare();

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        System.out.println("square = " + square);
    }
}
