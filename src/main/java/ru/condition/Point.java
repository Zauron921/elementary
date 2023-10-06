package ru.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return Math.sqrt(rsl);
    }

    public static void main(String[] args) {
        double result = Point.distance(10, 20, 20, 40);
        System.out.println("result (10, 20) to (20, 40) " + result);
    }
}
