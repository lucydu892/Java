import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aufgabe 7 : Eine Ganzzahl binär darstellen");

        while (true) {
            System.out.println("Ganze Dezimalzahl eingeben (q to Quit):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                String bin = "";
                int wert = num;

                while (wert > 0) {
                    int rest = wert % 2;
                    bin = rest + bin;
                    wert = wert / 2;
                }

                System.out.println("Binäre Darstellung: " + bin + "\n");
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe, bitte eine gültige Ganzzahl eingeben.");
            }
        }

        scanner.close();
    }
}