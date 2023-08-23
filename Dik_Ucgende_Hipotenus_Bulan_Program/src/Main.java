

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a,b;
    double c;
    System.out.print("A kenarını girin: ");
    a = scanner.nextInt();
    System.out.print("B kenarını girin: ");
    b = scanner.nextInt();
    c = Math.sqrt((a*a)+(b*b));
    System.out.println("\n"+"A kenarı: "+a+ "\nB kenarı: " + b+"\nHipotenüs: "+c);
    }
}