package practice_day02;

import java.util.Scanner;

public class Q06_Scanner {
    public static void main(String[] args) {
        /*  Problem Tanımı
    Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
    hesaplayan kodu yazınız.
    Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
    Buna göre 2 işçi aynı işi kaç günde yapar?

    Örnek Ekran Çıktısı
     Bir işçi işi kaç günde bitirmektedir? 10
     Toplam kaç işçi çalışacak? 2
    İşin bitme süresi 5 gündür. */
        Scanner scan=new Scanner(System.in);
        System.out.print("bir isci isi kac gunde bitirebilir :");
        int birIsciBitirmeSuresi=scan.nextInt();
        System.out.print("Toplam kac isci calisacak :");
        int isci_Sayisi = scan.nextInt(); // isci_Sayisi snek kez dir
        
        double cokluBitirmeSuresi = birIsciBitirmeSuresi/isci_Sayisi;
        System.out.print("cokluBitirmeSuresi = " + cokluBitirmeSuresi);
        // ornegin 9 ve 2 girsaydim islemin sonucu 4.0 olur cunku int olarak hesapladi.
        // ama int lari double a cevirirsem sonuc 4.5 olarak verir.
    }
}
