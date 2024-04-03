import java.util.Random;

public abstract class Karakterid {
    public int elud;
    public String nimi;
    public int rynnakNum;
    public int kaitseNum;
    public int raviNum;

    public Karakterid(String nimi) {
        this.nimi = nimi;
    }
    public void rynda(Vaenlane vaenlane) {

        System.out.println("Karakter ründab");
        vaenlane.setElud(vaenlane.getElud() - rynnakNum);
        System.out.println("Karakter ründas: " + rynnakNum);
    }
    public void kaitse(Vaenlane vaenlane) {
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,getKaitseNum()) + 1;
//        System.out.println("Kaitse number on " + getKaitseNum());
        vaenlane.setElud(vaenlane.getElud() - suvalinetagasilook);
        setElud(getElud()+suvalinetagasilook);
        System.out.println("Karakter kaitses ennast ning tegi vastasele haiget: " + suvalinetagasilook + " ning ravis ennast sama palju");
    }
    public void ravi() {
        System.out.println("Karakter ravib");
        setElud(getElud()+raviNum);
    }

    public int getRynnakNum() {
        return rynnakNum;
    }

    public int getKaitseNum() {
        return kaitseNum;
    }

    public int getRaviNum() {
        return raviNum;
    }

    public int getElud() {
        return elud;
    }

    public void setElud(int elud) {
        this.elud = elud;
    }
}
