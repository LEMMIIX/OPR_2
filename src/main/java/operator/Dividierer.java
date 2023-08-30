package operator;

public class Dividierer extends BinaererOperator {
    private double arg = 3.0;

    public Dividierer(double zahl) {
        super(zahl);
    }
    @Override
    public String gibName() {
        return "Division";
    }

    @Override
    public String gibKonstruktor() {
        return "new Dividierer(" + this.zahl + ")";
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
        return argument / this.zahl;
    }
}
