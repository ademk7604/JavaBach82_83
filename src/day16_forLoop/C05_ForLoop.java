package day16_forLoop;
import java.util.Scanner;
public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 10 ) Kullanicidan iki sayi isteyin.
        Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        sonucu yazdiran bir method yaziniz
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis degerlerini pozitif tamsayi olarak girin");
        int bas=scan.nextInt();
        int bitis=scan.nextInt();
        aralariTopla(bas,bitis);
    }
    public static void aralariTopla(int bas, int bitis) {
        int toplam=0; // int toplami if'in icinde olusturmus olsaydim toplamazdi. dikkat et.
        if (bas<=bitis){
            for (int i = bas; i <=bitis ; i++) { // ornegin kullanici 10 12 girdi
                toplam +=i;
            }
        }else{
            for (int i = bitis; i <=bas ; i++) { // ornegin kullanici 12 10 girdi. her ihtimal saglanmis oluyor
                toplam +=i;
            }
        }
        System.out.println("Aradaki sayilarin toplami : " + toplam);
    }
}