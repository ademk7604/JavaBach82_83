package day34_inheritance;
public class Isci extends Personel{
    /* Normal hayatimizda parent cocuk sahibi olmaya karar verebilir.
    Java da ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler. // burasi cok onemli java da tercih kalli cheilden

    mesela isci calss i olusturunca nelere ihtiyaci var diye dusunursek,
    Personel classs indaki tum variable ve method lara ihtiyaci oldugunu gorebiliriz.
    bu durumda yeniden o variable ve methodlari olusturmak yerine  personel class ini kendimize parent ediniriz.
    Bir class i parent edinmek icin extends keyword kullanmaliyiz.yukarda yaptim simdi

    Bir class baska bir class i parent edindiginde
    1- parent class daki tum ozelliklere (variable + method) otomatik olarak sahip olur.
    2- parent class daki ozelliklerden bazilarini kendine uyralayabilir
    3- parent class daolmayan bazi yeni ozellikler olusturabilir.(yani veriable veya method)
     not: parent class daki ozelliklerden hic birini reddemez ama degistirebilir.  */
    int persNo=1001;
    public static void main(String[] args) {
        Isci isci1=new Isci();
        System.out.println(isci1.isim); // extends kelimesi sildigimde isci kirmizi oluyor// Isim belirtilmed
        //extends kelimesi personel classini babamiz yapiyor. ordan isci veriable sini kullaniyorum
        // kendi classimizda isim variable yok, onun icin parent e gideriz
        isci1.isim="Selim"; // boyle atama yapabiliyorum.
        System.out.println(isci1.persNo); // burdaki veaibale yi kullandi once kendi evimize baktik yoksa babaminkisi garanti orda vardir.
        // 1001 kendi clasimizda var sa onu kullaniriz
        isci1.maas(); /* Isciler minumum 15 euro saat ucreti alir */ }
    public void maas(){ System.out.println("Isciler minumum 15 euro saat ucreti alir"); }
    public void ozelSigorta (){ System.out.println("Iscilerden isteyene yuzde 50 indirim yapilir"); }
}
