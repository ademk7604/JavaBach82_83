package day07_ifStatements;

import java.util.Scanner;

public class C09_IfElseSoru_4 {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //olmadigini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin 1. kenarini giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen ikinci kenarini giriniz");
        int sayi2 = scan.nextInt();

        if (sayi1 == sayi2) {
            System.out.println("dikdortgen karedir");
        } else {
            System.out.println("dikdortgen kare degildir");
        }
    }
}
