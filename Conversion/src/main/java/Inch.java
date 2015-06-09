
public class Inch extends Length {
    @Override
    public double toBaseUnit(double amount) {
        return 2.54 * amount;
    }

    @Override
    public double fromBaseUnit(double amount) {
        return amount / 2.54;
    }
}
