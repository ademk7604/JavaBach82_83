package day55_replitSorulari;

import java.util.Arrays;

public class Q02_TumSayilarinCarpimiForeach {
    public static void main(String[] args) {
         /*
   Soru 1:
   Bir integer array olusturunuz ve bu array deki tum sayilarin carpimini For-each loop
   kullanarak bulunuz. Sonucu ekrana yazdiriniz.*/
        int [] sayilar= {20,33,55,67,12,15};
        int carpim=1;
        for (int each:sayilar
             ) {
            carpim *=each;
        }
        System.out.println(carpim);
        System.out.println("***");
        /*Soru 2:

        Bir integer list olusturunuz ve bu list'deki tum sayilarin karesinin toplamini For-each
        loop kullanarak bulunuz. Sonucu ekrana yazdiriniz./*
         */
        int [] list= {4,7,5,9,3,6};
        int toplam=0;
        for (int each:list
             ) {
             toplam +=each*each;
        }
        System.out.println(toplam);
        System.out.println("****");
        /*Soru 3
        iki String array olusturunuz ve bu array'lerdeki ortak elemanlari For-each loop
        kullanarak bulunuz. Sonucu ekrana yazdiriniz.*/

        String [] arr1={"Ali","Ahmet","Ilknur","Samet"};
        String [] arr2={"Mehmet","Veli","Ahmet","Ali"};
        String ortak="";
        for (String each:arr1
             ) {
            for (String each3:arr2
                 ) {
                if (each==each3){
                    ortak += each +" ";
                }else{
                    System.out.println("Ortak eleman yok");
                }
            }
        }
        System.out.println(ortak);
        System.out.println("*****");
        /*Soru 4:
   Bir String olusturunuz, bu String'deki character'leri for-each loop kullanarak
   yazdiriniz. ipucu: split*/
        String harfler=("Java ogrenmek icin calismak lazim");
        String []karakter=harfler.split("");
        for (String each:karakter
             ) {
        }

    }
}
