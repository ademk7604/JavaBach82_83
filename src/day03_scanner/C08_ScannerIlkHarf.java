package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {

        // kullanicidan ismini alip ilk harfini  buyuk harf olarak yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        /* Java Scanner classinda nextChar() metodu yoktur
        bunun yerine String olarak ilk kelimeyi alip onunda ilk harfini alabiliriz
        .toUpperCase() ile önce büyün harleri buyuk yaptik sonra
        charAt(0) surdaki char i getir bana 0 isaretledigimde ilk harfi yazdiriyoruz
         */
        char ilkHarf = scan.next().toUpperCase().charAt(0);
        System.out.println("Ismin ilk harfi :" + ilkHarf);

    }
}
