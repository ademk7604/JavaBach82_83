package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        kullanicidan ismini, soyismini  ve yasini alip
        girilen bilgiler = seyfi capar 34 seklinde yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        /*
        string verileri scanner ile alirken nex() : ilk bosluga kadar olan kismi (1 kelime alir)
        nextLine() : ise satirin sonuna kadar ne yazarsaka lir
        not: eger ardarda birden fazla string deger alacaksak nextLine() kullanmaliyiz.

         */
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        // girilen bilgiler = seyfi capar 34 seklinde yazdirin
        System.out.println("girilen bilgiler =" + isim + " " + soyisim + " " + yas);


    }
}
