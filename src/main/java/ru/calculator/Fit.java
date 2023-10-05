package ru.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 178;
        double man = manWeight(manHeight);
        short womanHeight = 165;
        double woman = womanWeight(womanHeight);
        System.out.println("Best weight for man: " + manHeight  + " is " + man);
        System.out.println("Best weight for woman: " + womanHeight  + " is " + woman);
    }

}
