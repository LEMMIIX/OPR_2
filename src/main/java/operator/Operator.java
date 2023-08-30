package operator;

public abstract class Operator {
    public abstract String gibName();
    public abstract String gibKonstruktor();
    public abstract double gibArgument();
    public abstract double gibWert();

    public abstract double wendeAn(double argument);

    //Template
    public final String gibInfo() {
        return "<p>" + this.gibName() + "</p><p>" + "Beispielaufruf: " +  this.gibKonstruktor()
                + ".wendeAn(" + this.gibArgument() + ") = " + this.gibWert() + "</p>";
    }
}
