import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0;


        do {
            System.out.print("Sayı giriniz: ");
            num = scanner.nextInt();
            if (num % 2 == 0 || num % 4 == 0) {
                sum += num;
            } else {
                continue;
            }
        } while (!(num % 2 == 1));
        ;
        System.out.println("\nGirilen sayıların toplamı: " + sum);
    }
}