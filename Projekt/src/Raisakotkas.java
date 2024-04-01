public class Raisakotkas extends RaskedVaenlased {

    public Raisakotkas(String nimi) {
        super(nimi);
    }

    @Override
    public void rynda(Karakter karakter) {
        super.rynda(karakter);
        setElud(getElud() + 15);
        System.out.println("Raisakotkas vähendas sinu elusid 30 võrra ja sai tagasi 15 elu.");
    }

    @Override
    public void kaitse(Karakter karakter) {
        super.kaitse(karakter);
        System.out.println("Raisakotkas kaitses sinu rünnakut ja vähendas sinu elusid ");
    }

    @Override
    public void ravi() {
        super.ravi();
        System.out.println("Raisakotkas ravis end ja sai tagasi 15 elu.");
    }

}
