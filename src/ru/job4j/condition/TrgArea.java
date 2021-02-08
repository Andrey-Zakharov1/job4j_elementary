package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c, double p) {
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2, 4);
        System.out.println("area (2, 2, 2, 4) = " + rsl);
    }
}