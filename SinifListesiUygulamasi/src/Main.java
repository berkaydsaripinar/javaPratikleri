import java.util.Scanner;
/*
-- 22.8.2023 - 00.10 --
Devam etmek istiyor musun? sorusu ardından "H" işaretlediğimiz
zaman program Exception fırlatıyordu. Bu problemi bir boolean
tanımlayarak ve kontrolünü yaparak çözdüm.
*/

public class Main {
    static boolean cikisYap;
    static String[] isimler = {
            "Berkay", "Sezgin", "Haluk", "Aleyna", "Atakan"
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (true != cikisYap) {
            System.out.println("");

            System.out.println("\n Öncelikle, kullanıcı listesini görüntüle dediğinizde, öğrenci listesi karşınıza gelecektir. \n Bu listeden, öğrencilerin numaralarını seçtiğinizde, size onuun için bir yaş girmesini isteyecektir. \n Ve girdiğiniz yaş doğrultusunda öğrenci bir sınıfa atanacaktır \n");
            System.out.println("");

            System.out.println("Öğrenci listesini görüntülemek için 1 yaz ve Enter'a tıkla");
            secimYap();
        } else {
            System.out.println("");
            System.out.println("Çıkış yapıldı.");
            scanner.close();
        }
    }

    private static void secimYap() {
        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();
        while(true) {
            if (secim == 1) {
                if(cikisYap != true) {
                    System.out.println("");
                    System.out.println("Öğrenci Listesi:");
                    for (int i = 0; i < isimler.length; i++) {
                        System.out.println((i + 1) + "- " + isimler[i]);
                    }
                }else{
                    System.out.println("Çıkış yapıldı.");

                    break;
                }
                System.out.println("");
                System.out.println("Seçim yapınız:");
                int secim2 = scanner.nextInt();
                if (secim2 == 1) {
                    System.out.println("");
                    System.out.println("Berkay'ın yaşını giriniz :");
                    yaslarFunc();
                } else if (secim2 == 2) {
                    System.out.println("");
                    System.out.println("Sezgin'ın yaşını giriniz :");
                    yaslarFunc();
                } else if (secim2 == 3) {
                    System.out.println("");
                    System.out.println("Haluk'un yaşını giriniz :");
                    yaslarFunc();
                } else if (secim2 == 4) {
                    System.out.println("");
                    System.out.println("Aleyna'nın yaşını giriniz :");
                    yaslarFunc();
                } else if (secim2 == 5) {
                    System.out.println("");
                    System.out.println("Atakan'ın yaşını giriniz :");
                    yaslarFunc();
                } else {
                    System.out.println("");
                    System.out.println("Böyle bir numara bulunamadı, program kapatılıyor");
                    break;
                }
            }else {
                System.out.println("");
                System.out.println("Lütfen uygun seçimi yap, program kapatılıyor");
                break;
            }

        }
        scanner.close();
    }

    public static void yaslarFunc() {
        Scanner scanner = new Scanner(System.in);
        int yasGiris = scanner.nextInt();
        if (yasGiris <= 10) {
            System.out.println("");
            System.out.println("Öğrencimizin ilkokula kaydı yapıldı.");
        } else if (yasGiris >= 11 && yasGiris <= 14) {
            System.out.println("");
            System.out.println("Öğrencimizin ortaokula kaydı yapıldı.");
            System.out.println("");
        } else if (yasGiris > 14 && yasGiris <= 18) {
            System.out.println("");
            System.out.println("Öğrencimiz, sınavdan kaç puan aldı?");
            double puanGiris = scanner.nextInt();
            if (puanGiris <= 300) {
                System.out.println("");
                System.out.println("Öğrencimizin Meslek Lisesine kaydı yapıldı.");
                System.out.println("");
                devamMi();
            } else if (puanGiris > 301 && puanGiris < 400) {
                System.out.println("");
                System.out.println("Öğrencimizin Anadolu Lisesine kaydı yapıldı.");
                devamMi();
            } else {
                System.out.println("");
                System.out.println("Öğrencimizin Fen Lisesine kaydı yapıldı.");
                System.out.println("");
                devamMi();
            }
        } else {
            System.out.println("");
            System.out.println("Artık mezun olsan mı ? :-D \n Kaydin yapilamadi ");
            System.out.println("");
            devamMi();
        }

    }
    public static void devamMi(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Devam etmek istiyor musunuz? (E/H): ");
        String continueChoice = scanner.next();
        if (continueChoice.equalsIgnoreCase("H")) {
            System.out.println("Çıkış yapılıyor.... \n");
            cikisYap = true;

        }else{
            System.out.println("Ana menüye dönülüyor....");
            cikisYap = false;
        }
    }

}

