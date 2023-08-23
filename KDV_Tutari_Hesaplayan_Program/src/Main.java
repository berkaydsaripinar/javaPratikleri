import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tax,sum,totalTax,totalSum;
        System.out.print("Aldığınız ürünün ücretini giriniz:  ");
        sum = scanner.nextDouble();
        if (sum<1000){
            System.out.println("Aldığınız ürünün ücreti 1000₺'den az olduğu için %18 KDV oranı uygulanacaktır  ");
            tax = 0.18;
            totalTax = sum*tax;
            System.out.println("Aldığınız ürüne yansıyan vergi tutarı:  "+totalTax);
            totalSum = totalTax+sum;
            System.out.println("Aldığınız ürünün vergi dahil ücreti:  "+totalSum);
        }else{
            System.out.println("Aldığınız ürünün ücreti 1000₺'den fazla olduğu için %8 KDV oranı uygulanacaktır  ");
            tax = 0.08;
            totalTax = sum*tax;
            System.out.println("Aldığınız ürüne yansıyan vergi tutarı:  "+totalTax);
            totalSum = totalTax+sum;
            System.out.println("Aldığınız ürünün vergi dahil ücreti:  "+totalSum);
        }

    }
}