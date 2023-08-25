
import java.util.Scanner;

public class Main {
    static String username;
    static String password;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz:  ");
        username = scanner.nextLine();
        System.out.print("Şifrenizi giriniz:  ");
        password = scanner.nextLine();

        if (username.equalsIgnoreCase("patika") && password.equalsIgnoreCase("java")) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.println("Şifreniz yanlış.");
            System.out.println("Eğer parolanızı değiştirmnek isterseniz ekrana 1 yazın");
            int select = scanner.nextInt();

            if (select == 1) {
                password();
            } else {
                System.out.println("Doğru bir seçim yapın.");
            }

        }
    }

    public static void password() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yeni şifrenizi giriniz: ");
        String newPassword = scanner.nextLine();
        String newPasswordSecurity = newPassword;
        while (true) {
            if (newPassword.equalsIgnoreCase("java")) {
                System.out.println("\nYeni şifreniz eski şifreniz ile aynı olamaz.");
                break;
            } else if (newPasswordSecurity != "" && newPassword != "java" && newPassword != "JAVA") {
                System.out.println("Şifreniz başarıyla oluşturuldu, yeni şifreniz: " + newPassword);
                break;
            }
        }
    }
}

