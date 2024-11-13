import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl 1: ");
        int zahl1 = scanner.nextInt();
        System.out.println("Zahl 2: ");
        int zahl2 = scanner.nextInt();
        System.out.println("------------------------------------");
        System.out.println("Zahl | Quersumme  | Zahl / Quersumme");
        System.out.println("------------------------------------");
        for (int i = zahl1; i <= zahl2; i++) {
            int querSumme = berechneQuersumme(i);
            if (i % querSumme == 0 ) {
                System.out.print(i + "   |" + querSumme + "          |" +  i / querSumme + "\n");
            }
        }

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