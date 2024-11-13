public class Main {
    public static void main(String[] args) {
        System.out.println("Zahlen zwischen 1 und 30, die durch 5 und/oder 3 ohne Rest teilbar sind");
        int i = 1;
        for (i = 1; i <= 30; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i);

                if (i < 30) {
                    System.out.print(", ");
                }

            }
        }
        System.out.println();
    }
}