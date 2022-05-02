public class Zutat {

    private String name;
    private double preis;
    private Zutat nextZutat;

    public Zutat getNextZutat() {
        return nextZutat;
    }

    public void setNextZutat(Zutat nextZutat) {
        this.nextZutat = nextZutat;
    }

    public Zutat getPrevZutat() {
        return prevZutat;
    }

    public void setPrevZutat(Zutat prevZutat) {
        this.prevZutat = prevZutat;
    }

    private Zutat prevZutat;

    public Zutat (String name, double preis){

        this.name = name;
        this.preis = preis;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPreis() {
        return preis;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }

}
