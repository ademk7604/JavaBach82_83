package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1) t-> "Logic" , (t,u)-> "Logic"
       Bu yapiya "Lambda Expession" diyoruz.
    2) Functional Programming kapsaminda "Lambda Expession" kullanilabbilir ama onerilmez.
       "Lambda Expession" yerine "Method Reference" tercih edilir.
    3) "Method Reference" kullanimi "Class Name :: Method Name"

        Ayni zamanda kendi class larinizi da kullanabilirsiniz.
        ornegin bir Animal class'iniz var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
        (ornegin 32 den buyu degerler dedigimizde bununn cin lambda expression kullanirim method olmaz)
     */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariniYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsızTekElemanlarinKupunuYazdir(liste);
        tekrarsizCiftElemnlarinKareToplami01(liste);
        tekrarsizCiftElemnlarinKareToplami02(liste);
        tekrarsizCiftElemnlarinKareToplami03(liste);
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        getMaxEleman(liste);
        yedidenBuyukCiftMin(liste);
        tersSiralamaTekrarsizBestenBuyukElemanlarinYarisi(liste);
    }
    public static void listElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().forEach((Utils::ayniSatirdaBosluklaYazdir)); //8 9 131 10 9 10 2 8
        //bu class a git bu methodu kullan.
    }
    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){

        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsızTekElemanlarinKupunuYazdir(List<Integer> list){
        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir); //729 2248091
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemnlarinKareToplami01(List<Integer> list){

        Integer toplam =  list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0,Math::addExact); //addExact Toplama yapar
        System.out.println(toplam); // add ekle, topla anlamlari var
    }
    //2.yol
    public static void tekrarsizCiftElemnlarinKareToplami02(List<Integer> list){

        Integer toplam =  list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(Math::addExact).get(); //addExact Toplama yapar
        System.out.println(toplam); // get git her urun icin
    }
    //3.yol
    public static void tekrarsizCiftElemnlarinKareToplami03(List<Integer> list){

        Integer toplam =  list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0,Integer::sum); //addExact Toplama yapar
        System.out.println(toplam); // integer classtan sum methodu kullandik
    }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list){
      Integer carpim =  list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
      System.out.println(carpim); // MAth clasindan carpim fonksiyonu ile yaptik Integer class inda carpma fonksiyonu yokmus.
    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMaxEleman(List<Integer> list){
     Integer maxEleman = list.stream().distinct().reduce(Integer.MIN_VALUE,Math::max);// burda reduce da baslangic degeri atmadanda oldu.
        System.out.println("maxElemanim = " + maxEleman);
    }
    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void yedidenBuyukCiftMin(List<Integer> list){
      Integer min = list.stream().distinct().filter(Utils::ciftElemanlariSec).filter(t->t>7).reduce(Math::min).get();
      System.out.println("min = " + min); // burd adaa baslangici degeri koymamizin yerine get() dedik mumkun oldugu kadariylas sayi kullanmayalim
    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void tersSiralamaTekrarsizBestenBuyukElemanlarinYarisi(List<Integer>list){
     List<Double>  tersSiralamali = list.
             stream(). // gerekli methodlari kullanmamizi saglar
             distinct().//Tekrarli olanlari almaz
             filter(t->t>5).// kosula gore filtreleme yapar
             map(Utils::yarisiniAl).//Her bir elemanin degerini degistirmeye yarar
             sorted(Comparator.reverseOrder()).//siralama yapar
             collect(Collectors.toList());// Elamanları collection'a çevirir.
        System.out.println("tersSiralamali = " + tersSiralamali);
    }
}


