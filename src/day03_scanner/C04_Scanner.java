package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanicidan ismini isteyin
        // girilen ismi
        // isminiz : ismail seklinde yazdirin

        // insanlarin dunyasindan kodalarimizin bulundugu classa deger almak icin scanner classini kullaniriz.

        // 1- scanner objesi olusturalim

        Scanner scan = new Scanner(System.in);

        // 2- kullanicidan ne istedigimizi soyleyelim.
        System.out.println("Lutfen isminizi giriniz");

        // 3- olusturdugumuz scan objesi ile kullanicinin girdigi degeri alip
        // olusturacagimiz uygun bir variable a atayalim.

        String kullaniciIsmi = scan.next(); //          kullanicigin girecegi bilgiyi alacaksak next ile baslariz, sonra
        System.out.println("isminiz: " + kullaniciIsmi); //listeden seceriz, sonra sol tarafta variable i yaz sonra isim
        // scanner in getirdigi bilgiyi kullaniIsmi ' ne koydum.

    }
}
