import java.util.Random;

public abstract class Karakter {
    public int elud;
    public String nimi;
    public int energia;

    public Karakter(String nimi) {
        this.nimi = nimi;
        this.energia = 50;
    }
    public void rynda(Vaenlane vaenlane) {
        vaenlane.setElud(vaenlane.getElud() - 10);
    }
    public void kaitse(Vaenlane vaenlane) {
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,10) + 1;
        vaenlane.setElud(vaenlane.getElud() - suvalinetagasilook);
    }
    public void ravi() {
        setElud(getElud()+5);
    }
    public void puhka(){
        energia += 50;
    }

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
