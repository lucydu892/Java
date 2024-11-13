import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dieses Programm berechnet die Summe von zwei Zahlen.");

        System.out.println("Zahl 1: ");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Zahl 2: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        int sum = number1 + number2;
        System.out.println("Summe:" + sum);
    }
}