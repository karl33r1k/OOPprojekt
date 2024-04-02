import java.util.Random;

public class Rott extends KergedVaenlased{

    public Rott(String nimi) {
        super(nimi);
        this.elud = 20;
    }

    @Override
    public void rynda(Karakter karakter) {
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int rynne = random.nextInt(0,10);
            karakter.setElud(karakter.getElud() - rynne);
        };
    }
}
