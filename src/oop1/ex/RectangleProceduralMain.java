package oop1.ex;

public class RectangleProceduralMain {
    //직사각형의 넓이(area), 둘레(perimeter) ,정사각형(square) 여부 구하는 프로그램
    //절차지향 => 객체지향으로 바꿀것
    public static void main(String[] args) {
        int width = 5;
        int height = 8;

        int area = calculateArea(width, height);
        System.out.println("넓이: " + area);

        int perimeter = calculatePerimeter(width,height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = isSquare(width,height);
        System.out.println("정사각형 여부: " + square);
    }

    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int calculatePerimeter(int width, int height) {
        return (width + height) * 2;
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }

}
