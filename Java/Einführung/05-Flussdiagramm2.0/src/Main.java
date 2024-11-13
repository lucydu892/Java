import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Kilometer möchtest du rennen:");

        int km = Integer.parseInt(scanner.nextLine());
        int bahnrunden = km * 1000/400;

        if (km > 42){
            System.out.println("Das schaffst du nicht!");
        }
        else {
            System.out.println("Das sind " + bahnrunden + " Runden.");
        }

        String antwort;
        //Abfrage

        do {
            System.out.println("Bereit für den Lauf?");
            antwort = scanner.nextLine().trim().toLowerCase();
        } while (!antwort.equals("ja") && !antwort.equals("nein"));

        //Auswertung

        if (antwort.equals("ja")) {
            System.out.println("Sie Sind Bereit.");
        } else {
            System.out.println("Noch einen schönen Tag.");
        }

        int i = 1;
        while (i <= bahnrunden) {
            System.out.println("Du läufst Runde " + i);
            i++;
        }
        System.out.println("Du hast es geschafft!");
    }
}