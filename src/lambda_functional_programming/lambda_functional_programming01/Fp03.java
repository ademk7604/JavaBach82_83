package lambda_functional_programming.lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        buyukHarfleYazdir(liste);
        System.out.println();
        //buyukHarfleYazdir02(liste);// list mutibel oldugu icin degistirilebilir burdaki degisiklikler kalici oldu.
        //System.out.println(liste);
        uzunlugaGoreYazdir(liste);
        System.out.println();
        onceSiralaSonraUzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizSirala(liste);
        System.out.println();
        //uzunlukVeIlkHarfeGoreSiralaYazdir(liste);
        System.out.println();
        //bestenBuyukleriSil(liste);
        //baslangiciAyadaSonuNolaniSil(liste);
        //baslangiciAyadaSonuNolaniSil02(liste);
        //uzunlugu8ile10arasiveOIleBitenSil(liste);
        System.out.println("uzunlugu12denAzMi(liste) = " + uzunlugu12denAzMi(liste));
        System.out.println("xIleBasliyorMu(liste) = " + xIleBaslamiyorMu(liste));
        System.out.println("rIleBitebVarMi(liste) = " + rIleBitebVarMi(liste));
    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    //1.yol
    public static void buyukHarfleYazdir(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir); // burda yazdirma foreach methodumuz var zaten
        //burda listi yazdirdik
    }

    //2. Yol
   /* public static void buyukHarfleYazdir02(List<String>list){
        list.replaceAll(String::toUpperCase);// sikini burda liste yi degistiriyor buyuk yapiyor. tum list elemanlarimin yerini buyuk harf ile degistirdi.
        System.out.println("list = " + list);
    }

    */
    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir); // her zaman kucukten buyuge dogal siramala ile yapar
        // sorted(Comparator.comparing()) siralama kosulunu belirtmek icin kullanilir // sadece sorted deseydik alfabetik siralama yapardi.
        // sorted(Comparator.comparing(String::length)), lengte gore siralar, lengt i  ayni ise list teki siralamasina gore siralama yapar.

    }
    public static void onceSiralaSonraUzunlugaGoreYazdir(List<String> list) {
        list.stream().sorted().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

        //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreTersYazdir(List<String> list) {
        list.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utils::ayniSatirdaBosluklaYazdir); // elemanlari uzunluklarina gore ters sirala // comparing karsilastirma
    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
    public static void sonKaraktereGoreTekrarsizSirala(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
        // son karakteri alip ona gore siralama yapacak yazdiracak. a i k n diye siralar.dogal siralama
        //Amanda Ali Mark Jackson Benjamin Mariano Alberto Christopher Tucker son harf ayni ise listedeki siralamayi yapiyor min ano
    }
    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
  /*  public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list) {
        list.
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl).
                        forEach(Utils::ayniSatirdaBosluklaYazdir);
                        //thenComparing() :==>siralam icin bir kosul daha belirtir
    }

   */
    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
   /* public static void bestenBuyukleriSil(List<String> list) {
        list.removeIf(t->t.length()>5);  //removeIf eger boylesyse sil
        System.out.println(list);
        //stream kullanırsak liste degistirecek metodları kullanamıyoruz zaten.
        stream kullanmazsak removeIf, replace gibi listeyi degiştiren metodları kullanabiliyoruz
        //List, mutable oldugu icin eleamlari islem sonrasi kalici degismesin diye .....
    }

    */
    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
    //1.Yol
   /* public static void baslangiciAyadaSonuNolaniSil(List<String> list){
        list.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n' );
        System.out.println("list = " + list);
    }

    */
    //2.Yol
   /* public static void baslangiciAyadaSonuNolaniSil02(List<String> list){

        list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
        System.out.println(list); //[Mark, Christopher, Mariano, Tucker]
    }

    */
    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.
    /*public static void uzunlugu8ile10arasiveOIleBitenSil(List<String> list){
        list.removeIf(t->(t.length()>7 && t.length()<11)|| t.endsWith("o"));
        System.out.println(list); //[Ali, Ali, Mark, Amanda, Christopher, Jackson, Tucker]
    }
    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun

     */
    public static boolean uzunlugu12denAzMi(List<String> list){
        return list.stream().allMatch(t->t.length()<12);
        //uzunlugu12denAzMi(liste) = true
        //allMatch hepsini bu sarti sagliyorsa, anyMatch herhangi biri uyusuyorsa, noneMatch hicbiri eslesmiyorsa,
    }
    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    public static boolean xIleBaslamiyorMu(List<String> list){

        return list.stream().noneMatch(t->t.startsWith("X"));//xIleBaslamiyorMu(liste) = true
    }
    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static boolean rIleBitebVarMi(List<String> liste) {
        //rIleBitebVarMi(liste) = true
        return liste.stream().anyMatch(t->t.endsWith("r") ||t.endsWith("R"));
    }

}