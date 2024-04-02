import java.util.Random;

public class Vihmauss extends KergedVaenlased{

    public Vihmauss(String nimi) {
        super(nimi);
        this.elud = 30;
    }

    @Override
    public void rynda(Karakter karakter) {
        super.rynda(karakter);
        karakter.setElud(karakter.getElud() - 5);
    }

    @Override
    public void kaitse(Karakter karakter) {
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,2)+1;
        karakter.setElud(karakter.getElud() - suvalinetagasilook);
    }
}
