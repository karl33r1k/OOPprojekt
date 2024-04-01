import java.util.Random;

public abstract class RaskedVaenlased extends Vaenlane {
    public int elud;
    public RaskedVaenlased(String nimi) {
        super(nimi);
        this.elud = 85;
    }

    @Override
    public void rynda(Karakter karakter) {
        karakter.setElud(karakter.getElud() - 30);
    }

    @Override
    public void kaitse(Karakter karakter) {
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,20)+1;
        karakter.setElud(karakter.getElud() - suvalinetagasilook);
    }

    @Override
    public void ravi() {
        setElud(getElud()+15);
    }
}
