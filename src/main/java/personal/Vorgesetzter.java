package personal;

public class Vorgesetzter extends Mitarbeiter{
    private int bestLimit;

    public Vorgesetzter(String name){
        super(name);
        this.pos = "Vorgesetzter";
    }

    public void setzeBestelllimit(int limit) {
        this.bestLimit = limit;
    }

    @Override
    public int gibLimit() {
        return this.bestLimit == 0
                ? allgLimit
                : bestLimit;
    }
}
