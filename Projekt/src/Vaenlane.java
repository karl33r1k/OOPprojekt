import java.util.Random;

public abstract class Vaenlane extends Karakterid {
    public Vaenlane(String nimi) {
        super(nimi);
    }
    public abstract void rynda(Karakter karakter);
    public abstract void kaitse(Karakter karakter);
    public abstract void tegevus(Karakter karakter);
    public abstract void ravi();

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getElud() {
        return elud;
    }

    public void setElud(int elud) {
        this.elud = elud;
    }

    public String toString() {
        return "Vaenlase nimi: " + getNimi() +
                ", vaenlase elud: " + getElud();
    }
}
