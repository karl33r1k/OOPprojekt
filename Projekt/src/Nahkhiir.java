import java.util.Random;

public class Nahkhiir extends KergedVaenlased{

    public Nahkhiir(String nimi) {
        super(nimi);
        this.elud = 25;
        this.rynnakNum = 20;
        this.kaitseNum = 5;
        this.raviNum = 12;
    }

    @Override
    public void rynda(Karakter karakter) {
        super.rynda(karakter);
        karakter.setElud(karakter.getElud() - rynnakNum);
        System.out.println("Vaenlane ründas ja tegi haiget: " + rynnakNum);
    }


    @Override
    public void kaitse(Karakter karakter) {
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,10)+1;
        karakter.setElud(karakter.getElud() - suvalinetagasilook);
        System.out.println("Vaenlane ründas ja tegi haiget: " + rynnakNum);

    }
}
