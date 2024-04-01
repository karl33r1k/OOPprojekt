import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String karakteriNimi = JOptionPane.showInputDialog(null, "Tegelase nimi: ", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
        String karakteriTüüp = JOptionPane.showInputDialog(null, "Tegelase tüüp: ", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
        if (karakteriTüüp == "Sõdur") {
            Sõdur sõdur = new Sõdur(karakteriNimi);
        } else if (karakteriTüüp == "Meedik") {
            Meedik meedik = new Meedik(karakteriNimi);
        } else if (karakteriTüüp == "Vibulaskja") {
            Vibulaskja vibulaskja = new Vibulaskja(karakteriNimi);
        }
    }
}
