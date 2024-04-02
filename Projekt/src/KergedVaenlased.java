import java.util.Random;

public abstract class KergedVaenlased extends Vaenlane{
    public int elud;
    public int rynnakNum;
    public int kaitseNum;
    public int raviNum;
    public KergedVaenlased(String nimi) {
        super(nimi);
    }

    @Override
    public void rynda(Karakter karakter) {
        System.out.println("Vaenlane otsustas rünnata");
    }
    @Override
    public void kaitse(Karakter karakter) {
        System.out.println("Vaenlane otsustas kaitsta ");
    }
    @Override
    public void ravi() {
        System.out.println("Vaenlane otsustas ravida");
        setElud(getElud()+raviNum);
        System.out.println("Vaenlane ravis ennast: " + raviNum);
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
    public int getElud() {
        return elud;
    }

    @Override
    public void setElud(int elud) {
        this.elud = elud;
    }
    @Override
    public String toString() {
        return "Vaenlane{" +
                "nimi='" + nimi + '\'' +
                ", elud=" + elud +
                '}';
    }
}
