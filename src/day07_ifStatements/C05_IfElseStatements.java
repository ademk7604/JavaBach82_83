package day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir karakter girmesini isteyin
        ve girilen karakterin harf olup olmadigini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char harf = scan.next().charAt(0); // char oldugunda next.char yoktu onun yerine next alip charAt deyip 0 index.
        if ((harf >= 'a' && harf <= 'z') || (harf >= 'A' && harf <= 'Z')) { // harf araligini ascii degerinden biliyo J.
            System.out.println("Girilen karakter bir harf");
        } else {
            System.out.println("Girilen karakter bir harf degil");
            // bir olayin gerceklesmesi icin sadece 2 durum soz konusu ise if-else kullanabiliriz.
        }
    }
}