public class Draakon extends RaskedVaenlased {
    public int elud;
    private int mitmesrynnak;
    public Draakon(String nimi) {
        super(nimi);
        this.mitmesrynnak = 0;
    }

    @Override
    public void rynda(Karakter karakter) {
        mitmesrynnak++;
        if (mitmesrynnak % 3 == 0) {
            karakter.setElud(karakter.getElud() - 45);
            System.out.println("Draakon purskas sinu suunas tuld ja vähendas sinu elusid 45 võrra.");
        }
        karakter.setElud(karakter.getElud() - 35);
        System.out.println("Draakon ründas sind ja vähendas sinu elusid 35 võrra.");
    }

    @Override
    public void kaitse(Karakter karakter) {
        super.kaitse(karakter);
        System.out.println("Draakon kaitses ennast ja sai tagasi ");
    }

    @Override
    public void ravi() {
        super.ravi();
        System.out.println("Draakon ravis ennast ja sai tagasi 15 elu.");
    }
}
