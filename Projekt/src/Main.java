import java.util.Random;
import java.util.Scanner;

public class Main {

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

        Karakter karakter = karakterityyp(nimi, tüüp); // karakteri loomine vastavalt valitud tüübile ja raskusastmele

        int skoor = 0;

        while (true) {
            if (karakter.getElud() <= 0){
                System.out.println(nimi + " saavutas " + skoor + " punkti.");
                break;
            }
            Random random = new Random();
            Vaenlane vaenlane = vaenlased(raskusaste); // suvalise vaenlase saamine
            int suva2 = random.nextInt(0, 2); // määrab, kas esimesena alustab mängija või vaenlane
            if (suva2 == 0) { // kui on 0, alustab mängija
                while(vaenlane.getElud() > 0) {
                    if (karakter.getElud() > 0 && vaenlane.getElud() > 0) {
                    System.out.println(karakter);
                        System.out.println(vaenlane);
                        System.out.println("Valikud on: 'R' - ründa, 'K' - kaitse, 'P' - parane, 'S' - supervõime");
                        System.out.println("Sisesta valik: ");
                        String valik = scanner.nextLine();

                        switch (valik) {
                            case "R" -> karakter.rynda(vaenlane);
                            case "K" -> karakter.kaitse(vaenlane);
                            case "P" -> karakter.ravi();
                            case "S" -> karakter.erilinevoime(vaenlane);
                        }
                        vaenlane.tegevus(karakter); // vaenlase käik
                    }else {
                        break;
                    }
                }

            } else { // alustab vaenlane
                while(vaenlane.getElud() > 0) {
                    if (karakter.getElud() > 0 && vaenlane.getElud() > 0) {
                        vaenlane.tegevus(karakter);
                        System.out.println(vaenlane);
                        System.out.println(karakter);
                        // mangija kaik
                        System.out.println("Valikud on: R - ründa, K - kaitse, P - parane, 'S' - supervõime");
                        System.out.println("Sisesta valik: ");
                        String valik = scanner.nextLine();
                        switch (valik) {
                            case "R" -> karakter.rynda(vaenlane);
                            case "K" -> karakter.kaitse(vaenlane);
                            case "P" -> karakter.ravi();
                            case "S" -> karakter.erilinevoime(vaenlane);
                        }

                    }else {
                        break;
                    }
                }
            }
            if (vaenlane.getElud() <= 0 && karakter.getElud() > 0) { // skoori kasvatamine
                skoor += skoorisysteem(vaenlane);
                System.out.println("Võitsid vastase " + vaenlane.getNimi() + " vastu. Sind ootab ees uus vastane.");
                System.out.println();
            }
        }
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
        public static Vaenlane vaenlased(String raskusaste) {
            Vaenlane vaenlane1 = null;
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
                } else {
                    vaenlane1 = vihmauss;
                }
            } else if (raskusaste.equals("Raske")) {
                Vaenlane raisakotkas = new Raisakotkas("raisakotkas");
                Vaenlane hunt = new Hunt("hunt");
                Vaenlane draakon = new Draakon("draakon");
                Random random = new Random();
                int suvaline = random.nextInt(0,3);
                if (suvaline == 0) {
                    vaenlane1 = raisakotkas;
                } else if (suvaline == 1) {
                    vaenlane1 = hunt;
                } else {
                    vaenlane1 = draakon;
                }
            }
            System.out.println("Vaenlaseks osutus " + vaenlane1.getNimi());
            return vaenlane1;
        }
        public static int skoorisysteem(Vaenlane vaenlane) {
            int skoor = 0;
            switch (vaenlane.getNimi()) {
                case "rott" -> skoor += 100;
                case "nahkhiir" -> skoor += 120;
                case "vihmauss" -> skoor += 140;
                case "raisakotkas" -> skoor += 200;
                case "hunt" -> skoor += 240;
                case "draakon" -> skoor += 280;
            }
            return skoor;
        }
}

