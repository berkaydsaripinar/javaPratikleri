

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float r,a;
        double pi = 3.14;

        System.out.print("Yarıçapını giriniz: ");
        r = input.nextFloat();
        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = input.nextFloat();

        double area = (pi *(r*r) *a)/360;
        System.out.print("Dairenin alanı : " + area);
    }
}