
public class Measurement {

    private final double amount;
    private final Unit unit;

    public Measurement(double amount, Unit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public Measurement convertTo(Unit toUnit) {

        return new Measurement(toUnit.fromBaseUnit(unit.toBaseUnit(getAmount())), toUnit);
    }

    public double getAmount() {
        return amount;
    }

}
