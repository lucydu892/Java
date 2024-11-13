
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ich rechne dir die Anzahl der Buchstaben und wie viele Vokale vorkommen.");
        System.out.println("Schreibe nun ein Wort oder ein Satz: ");
        String sentence = scanner.nextLine();
        int length = sentence.length();
        splitText(sentence);

        System.out.println(sentence);

        System.out.println("Dein Satz oder Wort besteht aus " + countLetters(sentence) + " Buchstaben");

        countVocals(sentence);
    }

    static String[] splitText (String sentance) {
        String[] letters = sentance.split("");
        for (String y : letters) {
            System.out.println(y);
        }
        return letters;
    }


    static int countLetters (String sentance) {
        int length = 0;
        for (int i = length; i < sentance.length(); i ++ ) {
            if (sentance.charAt(i) != ' ') {
                length++;
                }
        }
        return length;
    }


    static int[] countVocals(String sentence) {

        int countOfAs;
        int countOfEs;
        int countOfIs;
        int countOfUs;
        int countOfOs;

        int [] vocals = new int[6];
        vocals[0] = countOfAs = 0;
        vocals[1] = countOfEs = 0;
        vocals[2] = countOfIs = 0;
        vocals[3] = countOfOs = 0;
        vocals[4] = countOfUs = 0;

        char[] arr = sentence.toLowerCase().toCharArray();

        // die a zählen
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                countOfAs++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'e') {
                countOfEs++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'i') {
                countOfIs++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'o') {
                countOfOs++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'u') {
                countOfUs++;
            }
        }
        return vocals;
    }
}