import java.util.Random;

public class Meedik extends Karakter{

    public Meedik(String nimi) {
        super(nimi);
        this.elud = 65;
    }
    public void kaitse(Vaenlane vaenlane) {
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,15)+1;
        vaenlane.setElud(vaenlane.getElud() - suvalinetagasilook);
    }
    public void ravi() {
        setElud(getElud()+35);
    }
}
