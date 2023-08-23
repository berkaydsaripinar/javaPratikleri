import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c,u,area;
        System.out.println("Üçgenin kenar uzunluklarını sırasıyla giriniz:");

        System.out.print("a kenarı: ");
        a = scanner.nextDouble();
        System.out.print("b kenarı: ");
        b = scanner.nextDouble();
        System.out.print("c kenarı: ");
        c = scanner.nextDouble();

        // Üçgen çevresini hesaplama
        u = (a + b + c) / 2;
        System.out.println("Üçgenin Çevresi: " + u);

        // Üçgen alanını hesaplama
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + area);
    }
}