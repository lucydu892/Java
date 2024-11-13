import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl: ");
        int zahl = scanner.nextInt();
        int sum = berechneQuersumme(zahl);
        System.out.println("Die Quersumme von " + zahl + " ist: " + sum);
    }

    static int berechneQuersumme(int zahl) {
        int sum = 0;
        while (zahl != 0) {
            sum = sum + (zahl % 10);
            zahl = zahl / 10;
        }

        return sum;
    }

}
