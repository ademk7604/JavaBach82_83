package adayinÖdevleri;

import java.util.Scanner;

public class C01_day03Ödev1 {
    public static void main(String[] args) {
        // Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double sayi2=scan.nextDouble();
        System.out.println("Girilen sayilarin toplami :"+(sayi1 + sayi2));
        System.out.println("Girilen sayilarin carpimi :"+(sayi1 * sayi2));
        System.out.println("Girilen sayilarin farki :"+(sayi1 - sayi2));

    }
}
