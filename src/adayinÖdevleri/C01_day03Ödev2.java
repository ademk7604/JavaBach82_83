package adayinÖdevleri;

import java.util.Scanner;

public class C01_day03Ödev2 {
    public static void main(String[] args) {
        //Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini
        //hesaplayip yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("karenin cevresi :"+ sayi1*4);
        System.out.println("karenin alani :"+ sayi1*sayi1);

    }
}
