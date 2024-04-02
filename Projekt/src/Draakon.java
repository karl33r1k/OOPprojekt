import java.util.Random;

public class Draakon extends RaskedVaenlased {
    private int mitmesrynnak;
    public Draakon(String nimi) {
        super(nimi);
        this.mitmesrynnak = 0;
        this.elud = 80;
        this.rynnakNum = 35;
        this.kaitseNum = 12;
    }

    @Override
    public void rynda(Karakter karakter) {
        mitmesrynnak++;
        if (mitmesrynnak % 3 == 0) {
            karakter.setElud(karakter.getElud() - (rynnakNum + 10));
            System.out.println("Vaenlane purskas sinu suunas tuld ja vähendas sinu elusid 45 võrra.");
        } else {
            karakter.setElud(karakter.getElud() - rynnakNum);
            System.out.println("Vaenlane ründas sind ja vähendas sinu elusid 35 võrra.");
        }
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

    @Override
    public void ravi() {
        super.ravi();
        System.out.println("Draakon ravis ennast ja sai tagasi 15 elu.");
    }
}
