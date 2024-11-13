import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Berechnung von Sekunden eines Monats in Abhängigkeit seiner Anzahl Tage");
            System.out.println("Wie viele Tag hat der Monat, für den Sie die Sekundenzahl berechnen wollen?");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String input = in.readLine();
            int days = Integer.parseInt(input);

            if (days >= 28 && days <= 31) {
                int seconds = days * 24 * 60 * 60;  // Calculate seconds
                System.out.println("Der Monat hat " + seconds + " Sekunden.");
            } else {
                System.out.println("Bitte geben Sie eine Zahl zwischen 28 und 31 ein.");
            }


        } catch (NumberFormatException ex) {
            System.out.println("Eingabefehler. Bitte geben Sie eine Zahl ein.");
        } catch (Exception ex) {
            System.out.println("Unbekannter Fehler: " + ex.toString());
        }
    }
}