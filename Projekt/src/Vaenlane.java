import java.util.Random;

public abstract class Vaenlane {
    public String nimi;
    public int elud;
    public Vaenlane(String nimi) {
        this.nimi = nimi;
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
}
