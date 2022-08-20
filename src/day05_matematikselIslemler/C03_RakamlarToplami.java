package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt(); // 5267 girsin mesela

        int birlerBasamagi = 0;
        int rakamlarToplami = 0; //bu sekilde konteynerlarimizi olusturduk ve sifir ile baslattik
        int girilenSayi = sayi;

        // suanda sayi 5267 bb=0 rt=0

        birlerBasamagi = sayi % 10; // sayi modulus 10 birler basamagini verir. bb 7 yi bulduk
        rakamlarToplami += birlerBasamagi; // rt 7
        sayi /= 10; // son basamaktan kurtulduk. bb (6'yi)ni sayidan ayirdik toplamda duruyor. // 6

        //  suan sayi  526 bb 7 rt 7
        birlerBasamagi = sayi % 10; // 6
        rakamlarToplami += birlerBasamagi; // 7+6
        sayi /= 10; //2

        // suan sayi 52 bb 6 rt 13

        birlerBasamagi = sayi % 10; // bb 2
        rakamlarToplami += birlerBasamagi; //13+2=15
        sayi /= 10; // 5

        // suan sayi5 bb 2 rt 15

        birlerBasamagi = sayi % 10; // 5
        rakamlarToplami += birlerBasamagi; // 15+5=20
        sayi /= 10; // 0

        // suan sayi 0 bb 5 rt 20

        System.out.println(girilenSayi + " Sayinin rakamlar toolami: " + rakamlarToplami);
        //burda 4 defa bu islemi yaptigimiz icin 5 basamakli bir sayi girsek son sadece 4 basamagi toplar ==> dedöngüler
    }
}
