import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe einen Beitrag in CHF an:");
        Double money = scanner.nextDouble();
        convertToDollar(money);
        convertToPound(money);
        convertToEuro(money);
        convertToYen(money);
    }
    public static void convertToDollar(Double chf){
        System.out.println("Der Betrag in Dollar ist: " + chf * 1.18);
    }
    public static void convertToPound(Double chf){
        System.out.println("Der Betrag in Pfund ist: " + chf * 0.89);
    }
    public static void convertToEuro(Double chf){
        System.out.println("Der Betrag in Euro ist: " + chf * 1.06);
    }
    public static void convertToYen(Double chf){
        System.out.println("Der Betrag in Yen ist: " + chf * 169.84);
    }
}
