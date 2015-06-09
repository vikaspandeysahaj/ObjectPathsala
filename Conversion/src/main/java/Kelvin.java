
public class Kelvin extends Temperature {
    @Override
    public double toBaseUnit(double amount) {
        return amount - 273;
    }

    @Override
    public double fromBaseUnit(double amount) {
        return amount + 273;
    }
}
