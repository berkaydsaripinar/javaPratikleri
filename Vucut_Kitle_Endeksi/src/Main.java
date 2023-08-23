
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m,kg,vucutKitleEndeksi;
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        m = input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kg = input.nextDouble();
        vucutKitleEndeksi = kg / (m * m);
        System.out.print("Vücut kitle endeksiniz:  " + vucutKitleEndeksi);

    }
}