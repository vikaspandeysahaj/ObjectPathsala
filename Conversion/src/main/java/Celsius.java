
public class Celsius extends Temperature {
    @Override
    public double toBaseUnit(double amount) {
        return amount;
    }

    @Override
    public double fromBaseUnit(double amount) {
        return amount;
    }
}
