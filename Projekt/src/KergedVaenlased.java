import java.util.Random;

public abstract class KergedVaenlased extends Vaenlane{
    public int elud;
    public KergedVaenlased(String nimi) {
        super(nimi);
        this.elud = 50;
    }

    @Override
    public int getElud() {
        return elud;
    }

    @Override
    public void setElud(int elud) {
        this.elud = elud;
    }

    @Override
    public String toString() {
        return "Vaenlase tüüp: " + nimi +
                ", vaenlase elud: " + elud;
    }
}
