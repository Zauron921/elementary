package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(200);
        System.out.println("200 rubles are: " + euro + " euro.");
        float dollar = rubleToDollar(400);
        System.out.println("400 rubles are: " + dollar + " euro.");
    }
}


