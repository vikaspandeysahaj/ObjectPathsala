
public class Fahrenheit extends Temperature {
    @Override
    public double toBaseUnit(double amount) {
        return ((amount - 32) * 5) / 9;
    }

    @Override
    public double fromBaseUnit(double amount) {
        return (amount * 9 / 5) + 32;
    }
}
