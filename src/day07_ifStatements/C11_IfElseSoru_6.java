package day07_ifStatements;

import java.util.Scanner;

public class C11_IfElseSoru_6 {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
        //birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
        //“Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 1. kenarini giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen ucgenin 2. kenarini giriniz");
        int sayi2 = scan.nextInt();
        System.out.println("Lutfen ucgenin 3. kenarini giriniz");
        int sayi3 = scan.nextInt();

        if (sayi1 == sayi2 && sayi2 == sayi3) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar degil");
        }
    }
}
