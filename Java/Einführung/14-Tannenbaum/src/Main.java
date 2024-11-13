import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Breite des Stammes? ");
        int widthTribe = scanner.nextInt();
        System.out.println("Höhe des Stammes? ");
        int heightTribe = scanner.nextInt();
        System.out.println("Höhe der Krone? ");
        int heightCrown = scanner.nextInt();
        drawCrown(heightCrown);
        drawTribe(widthTribe, heightTribe, heightCrown);
    }

    static void drawTribe (int width, int height, int heightCrown) {
        if (width != 0 && height != 0){
            int space= heightCrown * 2 -1 ;
            space = space / 2 - 1;

            for (int row = 1; row <= height; row++) {
                drawLine(space, width);
            }
        } else {
            System.out.println("ERROR! Gib eine Zahl, die höher als null ist");
        }
        System.out.println();
    }

    static void drawLine(int countOfSpaces, int countOfStars) {

        for (int i = 0; i < countOfSpaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < countOfStars; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
    static void drawCrown(int heightCrown) {
        if (heightCrown != 0) {
            int space = heightCrown - 1;
            int stars = heightCrown / heightCrown;

            for (int row = 1; row <= heightCrown; row++) {
                drawLine(space,stars);
                space = space -1;
                stars = stars + 2;
            }
        } else {
            System.out.println("ERROR! Gib eine Zahl, die höher als null ist");
        }
    }
}
