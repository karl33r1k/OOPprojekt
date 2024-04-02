import java.util.Random;

public abstract class Vaenlane {
    public String nimi;
    public int elud;
    public Vaenlane(String nimi) {
        this.nimi = nimi;
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
        int suva3 = random.nextInt(0, 3); // otsustab, mida teeb vaenlane
        if (suva3 == 0) {
            rynda(karakter);
        } else if (suva3 == 1) {
            kaitse(karakter);
        } else if (suva3 == 2) {
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
}
