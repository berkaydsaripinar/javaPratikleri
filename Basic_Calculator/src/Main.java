import java.util.Scanner;

public class Main {
    static boolean devam = true;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        while (devam == true) {
            System.out.print(" \n(1) - Toplama\n(2) - Çıkarma\n(3) - Çarpma\n(4) - Bölme\nYapmak istediğiniz işlemi giriniz:  ");
            select = input.nextInt();
            if (select == 1) {
                toplama();
            } else if (select == 2 && devam == true) {
                cikarma();
            } else if (select == 3) {
                carpma();
            } else if (select == 4) {
                bolme();
            } else {
                System.out.println("Geçersiz seçim yaptınız");
            }
        }
        System.out.println("\nProgram sonlandırılıyor.");
    }


    public static void toplama() {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("1. sayıyı girin: ");
        num1 = input.nextInt();
        System.out.print("2. sayıyı girin: ");
        num2 = input.nextInt();
        result = num1 + num2;
        System.out.print("\nSonuç: " + result);
        devamMi();
    }

    public static void cikarma() {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("1. sayıyı girin: ");
        num1 = input.nextInt();
        System.out.print("2. sayıyı girin: ");
        num2 = input.nextInt();
        result = num1 - num2;
        System.out.print("\nSonuç: " + result);
        devamMi();
    }

    public static void carpma() {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("1. sayıyı girin: ");
        num1 = input.nextInt();
        System.out.print("2. sayıyı girin: ");
        num2 = input.nextInt();
        result = num1 * num2;
        System.out.print("\nSonuç: " + result);
        devamMi();
    }

    public static void bolme() {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("1. sayıyı girin: ");
        num1 = input.nextInt();
        System.out.print("2. sayıyı girin: ");
        num2 = input.nextInt();
        result = num1 / num2;
        System.out.print("\nSonuç: " + result);
        int mod = num1 % num2;
        System.out.print("\nKalan: " + mod);
        devamMi();
    }

    public static void devamMi() {
        Scanner input = new Scanner(System.in);
        int select;
        System.out.print("\n\nDevam etmek ister misin?\n(1) Evet / (2) Hayır :  ");
        select = input.nextInt();
        if (select == 1) {
            devam = true;
        } else {
            devam = false;
        }
    }
}
