import java.util.Random;

public class Vibulaskja extends Karakter{

    public Vibulaskja(String nimi) {
        super(nimi);
    }
    public void rynda(Vaenlane vaenlane) {
        vaenlane.setElud(vaenlane.getElud() - 20);
    }
    public void kaitse(Vaenlane vaenlane) {
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,20)+1;
        vaenlane.setElud(vaenlane.getElud() - suvalinetagasilook);
    }
}
