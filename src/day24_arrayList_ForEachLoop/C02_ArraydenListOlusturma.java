package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000 den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */
        Random rnd=new Random(); // random; o ile 1 arasinda sayi uretir.
        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();


        while (sayiListesi.size()<200){
            sayi=rnd.nextInt(1000); // rnd.nextInt(int bounfd) bunu seciyorum girdigim degere kadar sayi uretsin diyorum

            if (!sayiListesi.contains(sayi)){ // sayi  yoksa
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);

        boolean bildiMi=false;
        int tahminSayisi=1;
        Scanner scan=new Scanner(System.in);

        while (!bildiMi){ // false basina ! koydugumda true oldu. while icin mutlaka true donmesi lazim. false olana kadar calisir

            System.out.println("Lutfen bir sayi tahminine bulun");
            sayi=scan.nextInt();
            if(sayiListesi.contains(sayi)){
                System.out.println("Tebrikler " + tahminSayisi + " adet tahminde listeden bir sayi buldunuz");
                bildiMi=true;
            }else{
                System.out.println(tahminSayisi + " adet sayi  soylediniz ama hic biri listede yok");
                tahminSayisi++;
            }

        }

    }
}
