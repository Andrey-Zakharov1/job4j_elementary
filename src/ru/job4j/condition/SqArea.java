package ru.job4j.condition;

public class SqArea {
    public static double height(int p, int k) {
        double h = p / (2 * (k + 1));
        return h;
    }

    public static double length(int h, int k) {
        double l = h * k;
        return l;
    }

    public static double square(int L, int h) {
        double s = L * h;
        return s;
    }

    public static void main(String[] args) {
        double h = SqArea.height(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + h);
        double l = SqArea.length(1, 2);
        System.out.println(" h = 1, k = 2, real = " + l);
        double s = SqArea.square(2, 1);
        System.out.println(" L = 2, h = 1, real = " + s);
    }
}
