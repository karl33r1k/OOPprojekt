import java.util.Random;

public abstract class Vaenlane {
    public String nimi;
    public int elud;
    public Vaenlane(String nimi) {
        this.nimi = nimi;
        this.elud = 25;
    }


    public void rynda(Karakter karakter) {
        karakter.setElud(karakter.getElud() - 10);
    }


    public void kaitse(Karakter karakter) {
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,10)+1;
        karakter.setElud(karakter.getElud() - suvalinetagasilook);
    }
    public void tegevus(Karakter karakter){
        Random random = new Random();
        int suvalinearv = random.nextInt(0,3);
        if (suvalinearv == 0){
            rynda(karakter);
        }
        else if (suvalinearv == 1) {
            kaitse(karakter);
        }
        else if (suvalinearv == 2) {
            ravi();
        }
    }


    public void ravi() {setElud(getElud()+5);}

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getElud() {
        return elud;
    }

    public void setElud(int elud) {
        this.elud = elud;
    }

    @Override
    public String toString() {
        return "Vaenlase tüüp: " + nimi +
                ", vaenlase elud: " + elud;
    }
}
