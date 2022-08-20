package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Listenin boyutu :" + sayilar1.size() );
        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1); //[5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println("Listenin yeni boyutu : " + sayilar1.size());

        sayilar1.set(2,8); // 2. indexteki elementi sil yerine 8 yaz dedik
        System.out.println(sayilar1); // [5, 3, 8, 2, 5, 3, 2, 2]
        System.out.println(sayilar1.set(0,12)); // silinen(5) elemani getirir eskisiyde neydi diye merak ediyiorsak boyle
        System.out.println(sayilar1); // listenin yeni halini verir
        /*
        set method'u istenen index'deki eski elementi silip
        yerine verdigimiz yeni elemani set eder.
        eger eski elementi silmek istemiyorsak,
        add(index,deger) methodu kullanabiliriz
        set() sildigi eski elementide bize dondurur.
        saykil bir ilerle. index koyuyor bi kaykilin diyor.

        sout icinde  set() sildigi eski elementi de bize dondurur. sildigimiz neydi diye
         */
    }
}
