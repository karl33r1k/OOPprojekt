import java.util.Random;

public class Sõdur extends Karakter{
    private int elud;
    public Sõdur(String nimi) {
        super(nimi);
        this.elud = 100;
    }
    public void rynda(Vaenlane vaenlane) {
        vaenlane.setElud(vaenlane.getElud() - 15);
    }
    public void kaitse(Karakter karakter) {
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,5)+1;
        karakter.setElud(karakter.getElud() - suvalinetagasilook);
    }
    public void Abi(Vaenlane vaenlane){ //Sõduri eriline võime
        if(energia >= 50){
            energia -= 50;
            vaenlane.setElud(vaenlane.getElud() - 30);
            setElud(getElud()+20);
        }
        else {
            System.out.println("Teil ei ole piisavalt energiat");
        }
    }



}
