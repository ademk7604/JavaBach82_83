package day07_ifStatements;

import java.util.Scanner;

public class C08_IfElseSoru_2 {
    public static void main(String[] args) {
        /*Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
        isimlerini yazdirin
        Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        ilkHarf=S output = “Sali */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gunun ilk harfini giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);
        if (ilkHarf == 'P') {
            System.out.println("Pazartesi \nPersembe \nPazar");
        }
        if (ilkHarf == 'S') {
            System.out.println("Sali");
        }
        if (ilkHarf == 'C') {
            System.out.println("Carsamba \nCuma \nCumartesi");
        }
    }
}