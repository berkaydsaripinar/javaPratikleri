

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,a;
        float pi = 3.14F;

        System.out.print("Yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = input.nextDouble();

        double area = (pi *(r*r) *a)/360;
        System.out.print("Dairenin alanı : " + area);
    }
}