import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0, adet = 0, sayi;
        System.out.print("Sayıyı girin: ");
        sayi = scanner.nextInt();

        for(int i = 0; i <= sayi; i++){
            if(i%3==0 || i%4==0){
                toplam +=i;
                adet++;
                System.out.println("Girdiğiniz sayıya kadar, 3'e veya 4'e tam bölünebilen toplam "+adet+" sayı var.");
            }
        }//for

        double ort = toplam/adet;
        System.out.println("\nSayıların toplamı: "+toplam +"\nSayıların ortalaması: "+ort);
    }
}