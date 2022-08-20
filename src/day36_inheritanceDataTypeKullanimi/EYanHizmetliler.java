package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe{
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;
    protected void maas() {
        System.out.println("Yan Hizmetliler  : " + (30 * saatUcreti * gunlukMesai) + " maas alir ");
    }
    protected void issizlikSigorta() {
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir");
    }
    public static void main(String[] args) {
     /*
        overriding child class'daki bir method'un parent class'daki ayni isimdeki methodu
        etkisiz hale getirerek kendisinin spesifik ozelligini ortaya cikarmasidir.
        Overriding'i nerede dikkate aliyoruz?
        Eger bir obje olusturulurken data turu ve constructor farkli ise objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz
        1- Obje constructor'in oldugu class'da olusur
        2- objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
           bu class'da aranan ozellik bulunamazsa parent class'lara bakilir ordada bulamazsak CTE verir
        3-   eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
        aranan ozellik method ise, degeri yazdirmadan once
        override edilmis mi diye kontrol etmemiz gerekir eger override edildiyse en guncel degeri yazdiriz.
        */


        BMuhasebe yh1=new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai);// M
        System.out.println(yh1.saatUcreti); // M
        yh1.maas(); //  aramayi muhasebeden basliyoruz ama, overriding edilmismidir ona bakar ve yanhizmetliler dekini calistirir.
        yh1.ozelSigorta();// M muhasebeden baktim var overriding edilmemis o zaman muhaseben alirim
        yh1.sigorta(); // p de bulduk hemen isatlemiyoruz bakiyoruz asagida bir yerde overriding yapilmismi hayir, personelden calisir
        System.out.println(yh1.isim); // p
        System.out.println(yh1.soyisim); // P
        System.out.println(yh1.departmant);// P
        //System.out.println(yh1.issizliksigorta); // bulamadik ki overriding edelim o yuzden CTE verir.
        //Aramaya muhasebeden basladigimizdan issizlik sigortasi bulamadik CTE. Bulsaydik overriding kontrol ederdik.

    }
}
