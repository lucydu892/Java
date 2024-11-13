import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie lang soll deine Linie sein? ");
        int countLine = scanner.nextInt();
        drawDiagnoalLine(countLine);
    }

    static void drawDiagnoalLine(int countline) {

        for (int row = 1; row <= countline; row++) {
            for (int col = 1; col <= countline; col++) {

                if (row == col){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}