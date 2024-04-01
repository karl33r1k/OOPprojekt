public class Hunt extends RaskedVaenlased {
    public int elud;
    public Hunt(String nimi) {
        super(nimi);
        this.elud = 100;
    }

    @Override
    public void rynda(Karakter karakter) {
        super.rynda(karakter);
        System.out.println("Hunt ründas sind ja vähendas sinu elusid 30 võrra.");
    }

    @Override
    public void kaitse(Karakter karakter) {
        super.kaitse(karakter);
        System.out.println("Hunt kaitses ennast ja vähendas sinu elusid ");
    }

    @Override
    public void ravi() {
        super.ravi();
        System.out.println("Hunt ravis ennast ja sai tagasi 15 elu.");
    }

}
