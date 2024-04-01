import java.util.Random;

public class Nahkhiir extends KergedVaenlased{

    public Nahkhiir(String nimi) {
        super(nimi);
    }

    @Override
    public void rynda(Karakter karakter) {
        karakter.setElud(karakter.getElud() - 10);
    }

    @Override
    public void kaitse(Karakter karakter) {
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,10)+1;
        karakter.setElud(karakter.getElud() - suvalinetagasilook);
    }
}
