import java.util.Random;

public class Vibulaskja extends Karakter{

    public Vibulaskja(String nimi) {
        super(nimi);
        this.elud = 50;
        this.rynnakNum = 15;
        this.kaitseNum = 8;
        this.raviNum = 6;
    }
    public void rynda(Vaenlane vaenlane) {
        vaenlane.setElud(vaenlane.getElud() - rynnakNum);
    }
    public void kaitse(Vaenlane vaenlane) {
        Random random = new Random();
        int suvalinetagasilook = random.nextInt(0,20)+1;
        vaenlane.setElud(vaenlane.getElud() - suvalinetagasilook);
    }
    public void automaatnesurm(Vaenlane vaenlane) {
        Random random = new Random();
        int suvalineNum = random.nextInt(0, 11);
        if (energia >= 70) {
            if (suvalineNum == 0) {
                vaenlane.setElud(vaenlane.getElud() - 100);
                System.out.println("Karakter tegi kasutas oma supervõimet, see õnnestus ja tegi vastasele haiget: 100");
            } else {
                vaenlane.setElud(vaenlane.getElud() - 1);
                System.out.println("Karakter tegi kasutas oma supervõimet, see ebaõnnestus ja tegi vastasele haiget: 1");
            }
        } else {
            System.out.println("Teil ei ole piisavalt energiat, sind sunnitakse automaatselt puhkama");
            puhka();
        }
    }
}
