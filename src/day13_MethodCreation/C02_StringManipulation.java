package day13_MethodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
           /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre=scan.nextLine();
        int kontrol=0; // bu konrol mekanizmasi ile butun sartlari saglayan sifreyi yazdirabilecegim mantigimdir.
        // ilk harf kontrolu
        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){ // ilk harf buyuk har bu 1. sart saglaiyor diyorum
            kontrol++;
        }else{
            System.out.println("Ilk harf buyuk harf olmali");
        }
        // son harf kontrolu
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else{
            System.out.println("Son harfi kucuk harf olmali");
        }
        // bosluk kontrolu
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        }else{
            kontrol++;
        }
        // sifre uznluk kontrolu
        if (sifre.length()>=8){
            kontrol++;
        }else{
            System.out.println("Sifre en az 8 karakter olmali");
        }

        if (kontrol==4){
            System.out.println("Sifre basarili ile tamamlandi");
        }else{
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }
    }
}
