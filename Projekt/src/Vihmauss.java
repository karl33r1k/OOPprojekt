import java.util.Random;

public class Vihmauss extends KergedVaenlased{
    public Vihmauss(String nimi) {
        super(nimi);
        this.elud = 30;
        this.rynnakNum = 10;
    }

    @Override
    public void rynda(Karakter karakter) {
        super.rynda(karakter);
        karakter.setElud(karakter.getElud() - rynnakNum);
        System.out.println("Vaenlane ründas ja tegi haiget: " + rynnakNum);
    }

    @Override
    public void kaitse(Karakter karakter) {
        super.kaitse(karakter);
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,kaitseNum)+1;
        karakter.setElud(karakter.getElud() - suvalinetagasilook);
    }

    @Override
    public void ravi() {
        super.ravi();
        setElud(getElud()+raviNum);
    }

}
