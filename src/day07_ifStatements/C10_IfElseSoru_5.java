package day07_ifStatements;

import java.util.Scanner;

public class C10_IfElseSoru_5 {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
        //gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
        //ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen haftanin bir gununu giriniz");
        String girilenGun = scan.next().toLowerCase();

        if (girilenGun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (girilenGun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (girilenGun.equals("pazar")) {
            System.out.println("Hiristiyanlar icin kutsal gun");
        } else {
            System.out.println("Lutfen gecerli bir gun giriniz");
        }
    }
}
