import java.util.Random;

public class Hunt extends RaskedVaenlased {
    public Hunt(String nimi) {
        super(nimi);
        this.elud = 65;
        this.rynnakNum = 30;
        this.kaitseNum = 15;
        this.raviNum = 15; // suurem kaitse- ja ravinumber
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
        int suvalinetagasilook = random.nextInt(0, kaitseNum) + 1;
        karakter.setElud(karakter.getElud() - suvalinetagasilook);
        setElud(getElud() + suvalinetagasilook);
        System.out.println("Vaenlane kaitses ennast, tehes sulle haiget: " + suvalinetagasilook + " ning ravis ennast sama palju");
    }

}
