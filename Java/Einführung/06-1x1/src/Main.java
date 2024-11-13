public class Main {
    public static void main(String[] args) {

        System.out.println("Kleines 1x1");
        //Schleife für kleines 1x1
        int i = 1;
        for (i = 1; i <= 10 ; i++){
            for ( int j = 1; j <= 10; j++){
                //Ausgabe
                System.out.print(i * j + "\t\t");
            }
            System.out.println();
        }
    }
}