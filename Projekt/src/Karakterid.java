import java.util.Random;

public abstract class Karakterid {
    public int elud;
    public String nimi;
    public int rynnakNum;
    public int kaitseNum;
    public int raviNum;

    public Karakterid(String nimi) {
        this.nimi = nimi;
    }

    public int getRynnakNum() {
        return rynnakNum;
    }

    public int getKaitseNum() {
        return kaitseNum;
    }

    public int getRaviNum() {
        return raviNum;
    }

    public int getElud() {
        return elud;
    }

    public void setElud(int elud) {
        this.elud = elud;
    }
}
