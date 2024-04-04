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

}
