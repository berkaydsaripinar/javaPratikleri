import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz: ");
        int heat = scanner.nextInt();
        if (heat < 5) {
            System.out.println("Kayağa gidebilirsiniz.");
        } else if (heat >= 5 && heat <= 25) {
            if (!(heat > 15)) {
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (!(heat < 10)) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}