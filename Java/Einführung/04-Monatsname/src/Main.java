import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl eingeben: ");
        int months = Integer.parseInt(scanner.nextLine());
        switch (months) {
            case 1:
                System.out.println("Monat: Januar");
                break;
            case 2:
                System.out.println("Monat: Februar");
                break;
            case 3:
                System.out.println("Monat: März");
                break;
            case 4:
                System.out.println("Monat: April");
                break;
            case 5:
                System.out.println("Monat: Mai");
                break;
            case 6:
                System.out.println("Monat: Juni");
                break;
            case 7:
                System.out.println("Monat: Juli");
                break;
            case 8:
                System.out.println("Monat: August");
                break;
            case 9:
                System.out.println("Monat: September");
                break;
            case 10:
                System.out.println("Monat: Oktober");
                break;
            case 11:
                System.out.println("Monat: November");
                break;
            case 12:
                System.out.println("Monat: Dezember");
        }
    }
}