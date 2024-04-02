import java.util.Random;

public class Sõdur extends Karakter{
    public Sõdur(String nimi) {
        super(nimi);
        this.elud = 100;
        this.rynnakNum = 12;
        this.kaitseNum = 5;
        this.raviNum = 4;
        this.energia = 45;
    }
    public void rynda(Vaenlane vaenlane) {
        vaenlane.setElud(vaenlane.getElud() - rynnakNum);
    }
    public void kaitse(Karakter karakter) {
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,kaitseNum)+1;
        karakter.setElud(karakter.getElud() - suvalinetagasilook);
    }
    public void SõjalineAbi(Vaenlane vaenlane){ //Sõduri eriline võime
        if(energia >= 50){
            energia -= 50;
            vaenlane.setElud(vaenlane.getElud() - 30);
            setElud(getElud()+20);
            System.out.println("Karakter sai 20 elu ja tegi vastasele haiget: 30");
        }
        else {
            System.out.println("Teil ei ole piisavalt energiat, sind sunnitakse automaatselt puhkama");
            puhka();
        }
    }



}
