import java.util.Random;

public class Vihmauss extends KergedVaenlased {
    public Vihmauss(String nimi) {
        super(nimi);
        this.elud = 30;
        this.rynnakNum = 10;
        this.kaitseNum = 8;
        this.raviNum = 7;
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
        setElud(getElud()+suvalinetagasilook);
        System.out.println("Vaenlane kaitses ennast ning tegi sulle haiget: " + suvalinetagasilook + " ning ravis ennast sama palju");
    }

//    @Override
//    public void ravi() {
//        super.ravi();
//        setElud(getElud() + raviNum);
//    } votsin ara, sest muidu ravib ennast 2 korda (KergedVaenlased klassis teeb ravimise meetod sama asja)

}
