
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        num = inp.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print("," + i);
            }
        }
    }


}