package personal;

public class Mitarbeiter {
    private final String name;
    private Vorgesetzter vorgesetzter;
    protected static int allgLimit = 20;
    protected String pos;

    public Mitarbeiter(String name){
        this.name = name;
        this.pos = "Mitarbeiter";
    }

    public static void setzeAllgemeinesLimit(int limit) {
        allgLimit = limit;
    }

    public void setzeVorgesetzten(Vorgesetzter vg) {
        this.vorgesetzter = vg;
    }

    public boolean darfBestellen(int bestellWert) {
        return allgLimit >= bestellWert;
    }

    public String gibHierarchie(){
        return this.vorgesetzter == null
                ? this.gibPos() + " " + this.gibName()
                : this.vorgesetzter.gibHierarchie() + "\n"
                    + this.gibPos() + " " + this.gibName();
    }

    //Template
    public final String gibInfo() {
        String info = "Ich bin " + this.gibPos() + ", Name " + this.gibName() + ". ";

        if (this.vorgesetzter != null) {
            info = info + "Mein Vorgesetzter ist " + this.vorgesetzter.gibName() + ". ";
        }

        info = info + "Mein Bestelllimit ist " + this.gibLimit() + " EUR.";

        return info;
    }

    private Vorgesetzter gibVG() {
        return this.vorgesetzter;
    }

    protected String gibName() {
        return this.name;
    }

    private int gibLimit() {
        return this.allgLimit;
    }

    private String gibPos() {
        return this.vorgesetzter == null && !this.pos.equals("Vorgesetzter")
                ? "freier Mitarbeiter"
                : this.pos;
    }
}
