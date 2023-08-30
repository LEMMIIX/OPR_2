package operator;

public class Addierer extends BinaererOperator {
    private double arg = 10.0;

    public Addierer(double zahl) {
        super(zahl);
    }

    @Override
    public String gibName() {
        return "Addition";
    }

    @Override
    public String gibKonstruktor() {
        return "new Addierer(" + this.zahl + ")";
    }

    @Override
    public double gibArgument() {
        return this.arg;
    }

    @Override
    public double gibWert() {
        return this.wendeAn(this.arg);
    }

    @Override
    public double wendeAn(double argument) {
        return this.zahl + argument;
    }
}
