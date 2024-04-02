import java.util.Random;

public class Raisakotkas extends RaskedVaenlased {

    public Raisakotkas(String nimi) {
        super(nimi);
        this.elud = 50;
        this.rynnakNum = 30;
        this.kaitseNum = 12;
    }

    @Override
    public void rynda(Karakter karakter) {
        super.rynda(karakter);
        setElud(getElud() + 8);
        karakter.setElud(karakter.getElud() - rynnakNum);
        System.out.println("Vaenlane ründas ja tegi haiget: " + rynnakNum + ", lisaks sai tagasi 15 elu.");
    }
    @Override
    public void kaitse(Karakter karakter) {
        super.kaitse(karakter);
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0, kaitseNum) + 1;
        karakter.setElud(karakter.getElud() - suvalinetagasilook);
        setElud(getElud() + suvalinetagasilook);
        System.out.println("Vaenlane kaitses ennast ning tegi sulle haiget: " + suvalinetagasilook + " ning ravis ennast sama palju");
    }

}
