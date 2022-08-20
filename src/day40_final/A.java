package day40_final;
public class A {
   protected String isim="Cuneyt";
    final static String OKUL="Yildiz Koleji"; //final ile  artik okul ismi baska yerde degistirilemez.
    /*
    Bir variable final olarak tanimlandiysa baska class lardan veya icind oldugumuz class dan
    bu variable baska deger atanmasi mumkun degildir.

    Mademki degeri degistirilemiyor genelde static de yaparak bu variable erisim kolaylastirilabilir.
    Genelde static final olarak belirlenen variable isimleri BUYUK HARFLE yazilir. OKUL:)

     */
    final void finalMethod(){
        System.out.println("finalMethodlar override edilemez");
        /*
        Bir method u final olarak isarretlerseniz bu method
        bu method degistirilemez demektir. yanietkisiz hale getirilemez uzerine yazilamaz. (override edilemez)

         */
    }
}
