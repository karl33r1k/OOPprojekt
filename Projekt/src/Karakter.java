import java.util.Random;

public abstract class Karakter extends Karakterid {
    public int energia;
    public Karakter(String nimi) {
        super(nimi);
    }

    public void rynda(Vaenlane vaenlane) {
        System.out.println("Karakter ründab");
    }
    public void kaitse(Vaenlane vaenlane) {
        System.out.println("Karakter kaitseb");
    }
    public void ravi() {
        System.out.println("Karakter ravib");
        setElud(getElud()+raviNum);
    }
    public void puhka(){
        Random random = new Random();
        int suvalineenergia = random.nextInt(0,51);
        energia += suvalineenergia;
        System.out.println("Karakter sai: " + suvalineenergia + " energiat");
    }
    public abstract void erilinevoime(Vaenlane vaenlane);

    public int getElud() {
        return elud;
    }

    public void setElud(int elud) {
        this.elud = elud;
    }


    public String getKarakterNimi() {
        return nimi;
    }

    public void setKarakterNimi(String nimi) {
        this.nimi = nimi;
    }


    @Override
    public String toString() {
        return "Karakteri nimi: " + nimi +
                ", karakteri elud: " + elud +
                ", karakteri energia: " + energia;
    }
}
