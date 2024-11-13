import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prüfen, ob es sich bei einem Jahr um ein Schaltjahr handelt.");
        System.out.println("*************************************************************");
        System.out.print("Eingabe Jahr: " );
        int year = scanner.nextInt();
        berechneSchaltjahr(year);
    }
    static void berechneSchaltjahr (int year){
         if ( year % 4 == 0 && year % 400 == 0) {
             System.out.println("Das Jahr " + year + " ist ein Schaltjahr.");
        } else {
             System.out.println("Das Jahr " + year + " ist KEIN Schaltjahr.");
         }
    }
}