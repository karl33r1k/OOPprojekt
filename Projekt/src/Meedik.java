import java.util.Random;

public class Meedik extends Karakter{

    public Meedik(String nimi) {
        super(nimi);
        this.elud = 65;
        this.rynnakNum = 8;
        this.kaitseNum = 4;
        this.raviNum = 15;
        this.energia = 20;
    }

    @Override
    public void rynda(Vaenlane vaenlane) {
        super.rynda(vaenlane);
        vaenlane.setElud(vaenlane.getElud() - rynnakNum);
    }

    public void kaitse(Vaenlane vaenlane) {
        super.kaitse(vaenlane);
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,kaitseNum)+1;
        vaenlane.setElud(vaenlane.getElud() - suvalinetagasilook);
        setElud(getElud()+suvalinetagasilook);
        System.out.println("Karakter kaitses ennast ning tegi vastasele haiget: " + suvalinetagasilook + " ning ravis ennast sama palju");
    }
    public void erilinevoime(Vaenlane vaenlane){
        if(energia >= 70){
            energia -= 70;
            setElud(getElud()+50);
            System.out.println("Karakter sai 50 elu");
        }
        else {
            System.out.println("Teil ei ole piisavalt energiat, sind sunnitakse automaatselt puhkama");
            puhka();
        }
    }
}
