import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randNumber = random.nextInt(100);
        System.out.println("Die gesuchte Zahl ist zwischen 1...100");

        int tries = playGame(randNumber);
        System.out.println("Die Zahl stimmt! Du hast total " + tries + " Versuche benötigt. Noch einmal spielen? [y/n]");

        String answer;
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            playGame(randNumber);
        }
        if (answer.equalsIgnoreCase("n")) {
            System.out.println();
        }
    }

    static Boolean checkNumbers(int randNumber, int guessNumber) {
        if (guessNumber == randNumber) {
            System.out.println("Richtig");
            return true;
        }
        if (guessNumber < randNumber) {
            System.out.println("Zu klein");
        }
        if (guessNumber > randNumber) {
            System.out.println("Zu gross");
        }

        return false;
    }

    static int playGame (int randNumber) {
       Scanner scanner = new Scanner(System.in);
       int tries = 0;
       boolean isGameOver = false;
       int guessNumber = 0;

        while (isGameOver == false) {
            tries++;
            System.out.println("Deine Zahl: ");
            guessNumber = scanner.nextInt();
            isGameOver = checkNumbers(randNumber, guessNumber);
        }
        return tries;
    }
}