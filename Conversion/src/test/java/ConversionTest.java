import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversionTest {
    @Test
    public void shouldConvertInchToCM() {
        Measurement measurement = new Measurement(1, new Inch());
        assertEquals(measurement.convertTo(new CM()).getAmount(),2.54,0);
    }

    @Test
    public void shouldConvertCelsiusToFahrenheit() {
        Measurement measurement = new Measurement(1, new Celsius());
        assertEquals(measurement.convertTo(new Fahrenheit()).getAmount(),33.8,0);
    }

    @Test
    public void shouldConvertFahrenheitToKelvin() {
        Measurement measurement = new Measurement(1, new Fahrenheit());
        assertEquals(measurement.convertTo(new Kelvin()).getAmount(),255.77,2);
    }
}
