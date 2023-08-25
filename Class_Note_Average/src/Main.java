import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int toplamNot = 0, gecerliDersSayisi = 0, gecmeNotu = 55, not;

        System.out.println("\nDers notlarınızı 0 ile 100 arasında girin. \nAksi taktirde hesaplanmayacaktr.\n");
        System.out.print(dersler[0] + " notunuzu giriniz: ");
        not = inp.nextInt();
        if (not >= 0 && not <= 100) {
            toplamNot += not;
            gecerliDersSayisi++;
        }

        System.out.print(dersler[1] + " notunuzu giriniz: ");
        not = inp.nextInt();
        if (not >= 0 && not <= 100) {
            toplamNot += not;
            gecerliDersSayisi++;
        }

        System.out.print(dersler[2] + " notunuzu giriniz: ");
        not = inp.nextInt();
        if (not >= 0 && not <= 100) {
            toplamNot += not;
            gecerliDersSayisi++;
        }

        System.out.print(dersler[3] + " notunuzu giriniz: ");
        not = inp.nextInt();
        if (not >= 0 && not <= 100) {
            toplamNot += not;
            gecerliDersSayisi++;
        }

        System.out.print(dersler[4] + " notunuzu giriniz: ");
        not = inp.nextInt();
        if (not >= 0 && not <= 100) {
            toplamNot += not;
            gecerliDersSayisi++;
        }

        inp.close();

        if (!(gecerliDersSayisi < 4)) {
            double ortalama = (double) toplamNot / gecerliDersSayisi;
            System.out.println("Ortalamanız: " + ortalama);

            if (ortalama >= gecmeNotu) {
                System.out.println("Sınıfı geçtiniz!");
            } else {
                System.out.println("Sınıfta kaldınız!!!!");
            }
        } else {
            System.out.println("Ders notlarınızdan ortalama oluşturmaya yeter sayıda 0 ile 100 arasında not girmediğiniz için hesaplama yapılamadı!");
        }
    }
}
