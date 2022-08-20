package adayinÖdevleri;

import java.util.Scanner;

public class C01_day03Ödev4 {
    public static void main(String[] args) {
        // Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        //prizmanin hacmini hesaplayip yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdörtgenler prizmasinin uzun kenarini giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Lutfen dikdörtgenler prizmasinin kisa kenarini giriniz");
        double sayi2=scan.nextDouble();
        System.out.println("Lutfen dikdörtgenler prizmasinin yuksekligini giriniz");
        double sayi3=scan.nextDouble();
        System.out.println("Dikdirtgenler prizmanizin hacmi :"+(sayi1*sayi2*sayi3));

    }
}
