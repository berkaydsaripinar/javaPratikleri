

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,a;
        double pi = 3.14;

        System.out.print("Yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = input.nextInt();

        double area = (pi *(r*r) *a)/360;
        System.out.print("Dairenin alanı : " + area);
    }
}