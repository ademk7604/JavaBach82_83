package day03_scanner;

import java.util.Scanner;

public class C09_Alistirma {
    public static void main(String[] args) {
        // kullanicidan ismini alip, ilk harfini  buyuk harf olarak yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi :" + ilkHarf );


    }
}
