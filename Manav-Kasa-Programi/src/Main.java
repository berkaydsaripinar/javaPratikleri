import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double armutKiloFiyati = 2.14;
        double elmaKiloFiyati = 3.67;
        double domatesKiloFiyati = 1.11;
        double muzKiloFiyati = 0.95;
        double patlicanKiloFiyati = 5.00;
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;

        System.out.print("Armut Kaç Kilo ? : ");
        armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKilo = scanner.nextDouble();

        double toplamTutar = (armutKilo * armutKiloFiyati) +
                (elmaKilo * elmaKiloFiyati) +
                (domatesKilo * domatesKiloFiyati) +
                (muzKilo * muzKiloFiyati) +
                (patlicanKilo * patlicanKiloFiyati);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
