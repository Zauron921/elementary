package ru.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;



class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expected = 1.4F;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RblThen2Dlr() {
        float in = 180;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert0RubToEuro() {
        float in = 0;
        float expected = 0.0F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert0Dot9999fToDollar() {
        float in = 0.9999F;
        float expected = 0.011F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

}
