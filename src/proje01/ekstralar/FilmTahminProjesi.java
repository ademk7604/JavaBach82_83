package proje01.ekstralar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmTahminProjesi {
     /*
    TASK :
    JOKER", "HOME ALONE 3"," +" "KARTALIN PENCESINDEKI YILAN", "INCEPTION", "PIYANIST", "GREENMILE","LEON", "GODFATHER",
     "JURASSICPARK", "TITANIC"
      1-yukaridaki film listinde bulunan filmlerden herhangi birisini kullanicinin film ismini  gormeden
        Filmler bir listede tutulacak (list array)
      2-filmin index nosuna gore sectiriniz
        scanner objesi ile kullanicidan giris alinacak
      3-secilen filmin  ismini filmin harf sayisinin 2 kati kadar hak taniyarak tahmin etmesini saglayan method create ediniz...
      girilen indexte bulunan filmin adinda kac karakter oldugu String manipulation ile tespit edilip konsola yazdirilacak.
      filmin adinda bulunan karakterleri * olarak konsola yazdiracak. karakter bilindikce yildizlar harfe donusecek.
      Ayni zamanda bu karakter sayisinin iki kati da konsola tahmi sayisi olarak yazdirilacak.
      void method(Char a) film adinda bu char yada string degerin olup olmadigini kontrol edecek.
      String gercekDeger="KARTALIN PENCESINDEKI YILAN":
      String soru="****** *********** *****";
      String soru="*A**A* *********** ***A*";   Tahmin ettiginiz harfler: C D E F A    dog
      tahmin ettiginiz harfler yerine, kalan harfleri yazdirabiliriz.
      * kullanicinin sectigi filmin harf sayisini  console yazdiriniz.
      * kullanicinin sectigi film icin tahmin hakkini  console yazdiriniz.
      * kullanicinin her tahmininde kalan hak sayisini console yazdiriniz.
      * kullanicinin her tahmininde dogru ve yanlis tahmin  sayisini console yazdiriniz.?????
      * kullanicinin kaybedip veya kazandigini ve tahmin etmesi gereken filmin ismini  console yazdiriniz.
     */


    public static void main(String[] args) {
        List<String> filmListesi = new ArrayList<String>();
        filmListesi.add("JOKER");
        filmListesi.add("HOME ALONE 3");
        filmListesi.add("KARTALIN PENCESINDEKI YILAN");
        filmListesi.add("INCEPTION");
        filmListesi.add("PIYANIST");
        filmListesi.add("GREENMILE");
        filmListesi.add("LEON");
        filmListesi.add("GODFATHER");
        filmListesi.add("JURASSICPARK");
        filmListesi.add("TITANIC");
        Scanner scan = new Scanner(System.in);
        System.out.println("Film Tahmin yarismasina Gosgeldiniz");
        System.out.println("1-" + (filmListesi.size()) + " arasinda bir sayi giriniz");
        int secim = scan.nextInt();
        filmSecimi(filmListesi, secim-1);


    }

    private static void filmSecimi(List<String> filmListesi, int secim) {
        switch (secim) {




        }
    }

}
