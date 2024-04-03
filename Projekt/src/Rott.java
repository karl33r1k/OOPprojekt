import java.util.Random;

public class Rott extends KergedVaenlased{

    public Rott(String nimi) {
        super(nimi);
        this.elud = 20;
        this.kaitseNum = 5;
        this.raviNum = 5;
    }
    @Override
    public void rynda(Karakter karakter) {
        super.rynda(karakter);
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int rynne = random.nextInt(0,10) + 1;
            karakter.setElud(karakter.getElud() - rynne);
            System.out.println("Vaenlane ründas ja tegi haiget: " + rynne);
        };
    }
    @Override
    public void kaitse(Karakter karakter) {
        super.kaitse(karakter);
        Random random = new Random();
      
        int suvalinetagasilook = random.nextInt(0,10) + 1;
        karakter.setElud(karakter.getElud() - suvalinetagasilook);
        setElud(getElud()+raviNum);
        System.out.println("Vaenlane kaitses ennast, tehes sulle haiget: " + suvalinetagasilook + " ning ravis ennast sama palju");
    }
}
