import java.util.Random;

public abstract class RaskedVaenlased extends Vaenlane {
    public int elud;
    public int rynnakNum;
    public int kaitseNum;
    public int raviNum;
    public RaskedVaenlased(String nimi) {
        super(nimi);
        this.elud = 70;
    }

    @Override
    public void rynda(Karakter karakter) {
        System.out.println("Vaenlane otsustas rünnata");
//        karakter.setElud(karakter.getElud() - 30);
    }

    @Override
    public void kaitse(Karakter karakter) {
//        Random random = new Random();
//        int suvalinetagasilook = random.nextInt(0,20)+1;
//        karakter.setElud(karakter.getElud() - suvalinetagasilook);
    }

    @Override
    public void tegevus(Karakter karakter) {
        Random random = new Random();
        int suva3 = random.nextInt(0, 3); // otsustab, mida teeb vaenlane
        if (suva3 == 0) {
            rynda(karakter);
        } else if (suva3 == 1) {
            kaitse(karakter);
        } else if (suva3 == 2) {
            ravi();
        }
    }

    @Override
    public void ravi() {
        System.out.println("Vaenlane otsustas ravida");
        setElud(getElud() + raviNum);
        System.out.println("Vaenlane ravis ennast " + raviNum);
    }

    @Override
    public String toString() {
        return "Vaenlase nimi: " + nimi +
                ", vaenlase elud: " + elud;
    }
}
