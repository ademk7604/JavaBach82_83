package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdir
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        //double sonuc= sayi>0 ? "sayi Pozitif" : (sayi*sayi); // soru double mi string mi olarak yazdiracagiz?
        // Eger ternary icindeki sonuclar farkli data turlerinde ise
        //atama YAPAMAYIZ, sadece yazdirabiliriz.
        System.out.println(sayi>0 ? "sayi Pozitif" : (sayi*sayi));

    }
}
