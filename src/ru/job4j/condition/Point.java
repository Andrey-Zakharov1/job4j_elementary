package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(x1-x2) + (y1-y2);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 6, 4, 3);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}