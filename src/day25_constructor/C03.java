package day25_constructor;

public class C03 {
    /*
    proje olusturulurken bazi class lar run etmek icin degil veriable ve method
    olusturup bunlari baska classlardan kullanmak icin olusturulur.
    (run yok main olmadigi icin bizim kaliphanemiz burasi
    ogretmen demistik onunla ilgili tum ozellikleri olusturup oraya koyarim
    isim veriable onunla ilgi hersey i olrda kullaniriz) */
    /*
    Default constructor, parametresizdir goremezsek bile ihtiyac oldugunda calisir
     Class icerisinde parametreli veya parametresiz herhangi bir constructor olusturursak
     java default constructor'i siler.*/
    C03(){
    }
    /*
    olusturdugumuz prametresiz bu constructor default const ile 1-1 aynidir.
    elimizde yukarda C03() yazdigimiz counstructor default counst olmaz ama biz olusturdugumuz icin buna
    default constructur demeyiz parametresiz constructor deriz.
    bir contst. olusturdugumuz icin default u java oldurur.*/
    String isim= "Etka";
    public void method01(){
        System.out.println("C03 method calsiti");// maksat is olsun
    }
}
