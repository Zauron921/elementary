package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float expectedEuro = 1.4F;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 1.4 Test result : " + passedEuro);

        float inRub = 200;
        float expectedRub = 2.2222223F;
        float outRub = Converter.rubleToDollar(200);
        boolean passedRub = expectedRub == outRub;
        System.out.println("200 rubles are 2.22 Test result : " + passedRub);
    }
}


