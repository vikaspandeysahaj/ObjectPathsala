
public class Meter extends Length{
    @Override
    public double toBaseUnit(double amount) {
        return 100*amount;
    }

    @Override
    public double fromBaseUnit(double amount) {
        return amount/100;
    }
}
