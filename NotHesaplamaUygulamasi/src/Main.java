import java.util.*;
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        String ok = "Sınıfı çektiniz";
        String no = "Sınıfı geçemediniz";
        int mathResult, physicalResult, chemicalResult, turkishResult, histResult, musicResult, totalResult;
       System.out.println("\n Not ortalaması hesaplama programına hoşgeldin.\n ");
        System.out.println("\n Aşağıdaki derslerin notunu hazırla: \n -Matematik \n -Fizik \n -Kimya \n -Türkçe \n -Tarih \n -Müzik \n");
        System.out.print("\n Matematik sınav sonucunu gir: ");
        mathResult = scanner.nextInt();
        System.out.print("\n Fizik sınav sonucunu gir: ");
        physicalResult = scanner.nextInt();
        System.out.print("\n Kimya sınav sonucunu gir: ");
        chemicalResult = scanner.nextInt();
        System.out.print("\n Türkçe sınav sonucunu gir: ");
        turkishResult = scanner.nextInt();
        System.out.print("\n Tarih sınav sonucunu gir: ");
        histResult = scanner.nextInt();
        System.out.print("\n Müzik sınav sonucunu gir: ");
        musicResult = scanner.nextInt();
        System.out.println("\n ...Hesaplanıyor...\n ");
        totalResult = mathResult+physicalResult+chemicalResult+turkishResult+histResult+musicResult;
        double averageResult = ((double) totalResult / 6);
        System.out.print("Not ortalaman:  "+ averageResult + "   !! DİKKAT:   ");
        String resultStr = averageResult > 59 ? ok : no;
        System.out.println(resultStr);
    }
}