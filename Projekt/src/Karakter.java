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
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,10) + 1;
        vaenlane.setElud(vaenlane.getElud() - suvalinetagasilook);
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
    @Override
    public String toString() {
        return "Karakteri nimi: " + nimi +
                ", karakteri elud: " + elud +
                ", karakteri energia: " + energia;
    }
}
