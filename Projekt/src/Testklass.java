import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Testklass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta enda karakteri nimi: ");
        String nimi = scanner.nextLine();
        System.out.println("Sisesta karakteri tüüp: ");
        System.out.println("Valikud on: 'Sõdur', 'Meedik', 'Vibulaskja'");
        String tüüp = scanner.nextLine();
        System.out.println("Sisesta raskusaste: ");
        System.out.println("Valikud on: 'Kerge', 'Raske'");
        String raskusaste = scanner.nextLine();

        Karakter karakter = karakterityyp(nimi, tüüp);

        Vaenlane vaenlane = vaenlased(raskusaste);
        System.out.println(vaenlane);
    }
    public static Vaenlane vaenlased(String raskusaste) {
        Vaenlane vaenlane1 = null;
        List<Vaenlane> vaenlased = new ArrayList<Vaenlane>();
        if (raskusaste.equals("Kerge")) {
            Vaenlane nahkhiir = new Nahkhiir("nahkhiir");
            Vaenlane rott = new Rott("rott");
            Vaenlane vihmauss = new Vihmauss("vihmauss");
            Random random = new Random();
            int suvaline = random.nextInt(0,3);
            if (suvaline == 0){
                vaenlane1 = nahkhiir;
            } else if (suvaline == 1) {
                vaenlane1 = rott;
            } else if (suvaline == 2) {
                vaenlane1 = vihmauss;
            }
        } else if (raskusaste.equals("Raske")) {
            Vaenlane raisakotkas = new Raisakotkas("raisakotkas");
            Vaenlane hunt = new Hunt("hunt");
            Vaenlane draakon = new Draakon("draakon");
            Random random = new Random();
            int suvaline = random.nextInt(0,3);
            if (suvaline == 0){
                vaenlane1 = raisakotkas;
            } else if (suvaline == 1) {
                vaenlane1 = hunt;
            } else if (suvaline == 2) {
                vaenlane1 = draakon;
            }
        }
        return vaenlane1;
    }
    public static int skoorisysteem(Vaenlane vaenlane){
        int skoor = 0;
        if (vaenlane.getNimi().equals("rott")){
            skoor += 100;
        } else if (vaenlane.getNimi().equals("nahkhiir")) {
            skoor += 120;
        } else if (vaenlane.getNimi().equals("vihmauss")){
            skoor += 140;
        } else if (vaenlane.getNimi().equals("raisakotkas")) {
            skoor += 200;
        } else if (vaenlane.getNimi().equals("hunt")) {
            skoor += 240;
        } else if (vaenlane.getNimi().equals("draakon")) {
            skoor += 280;
        }
        return skoor;
    }
    public static Karakter karakterityyp(String nimi, String tüüp) { // määrab karakteri tüübi
        Karakter karakter = null;
        if (tüüp.equals("Sõdur")) {
            karakter = new Sõdur(nimi);
        } else if (tüüp.equals("Meedik")) {
            karakter = new Meedik(nimi);
        } else if (tüüp.equals("Vibulaskja")) {
            karakter = new Vibulaskja(nimi);
        }
        return karakter;
    }
}