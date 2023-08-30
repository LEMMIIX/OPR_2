package operator;

public class Fakultaet extends Operator {
    private double arg = 10.0;
    @Override
    public String gibName() {
        return "Fakultaet";
    }

    @Override
    public String gibKonstruktor() {
        return "new Fakultaet()";
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
        return argument == 1
                ? argument
                : argument * wendeAn(argument - 1);
    }
}
