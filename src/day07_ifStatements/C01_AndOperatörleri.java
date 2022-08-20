package day07_ifStatements;

public class C01_AndOperatörleri {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b); // ilki true ikincisi true 3. de true 1 1 1 oldugundan carpim gibidir
                                                // sonuc 1 olur.

        System.out.println(a<0 && b<20 && c>=b); // a false b true c true sonuc  0 1 1 carptik sonuc 0 olur sonuc: false
        // && operatörunde ilk false buldugunda digerlerine bakmaz. Mukemmeliyetlik zinciri kirilmis olur.
        // & ise ilk false gördugunde bir digerlerine de bakayim belki bir hata vardir. sonuc olarak false verir

        System.out.println(a<0 & b<20 & c>=b); // false, bu ise ilki false olsa digerlerine bir bakalim der.
        // fark yukaridakine göre biraz yavas calismis olur.Her sart mutlaka kontrol edilsin diyorsak & kullanabiliriz
        /*
        java and operatöru konusunda bize 2 secenek sunar
        && kullanirsak, ilk false buldugunda artik sonucun false olacagini bilir ve geriye kalan sartlari incelemez.
        & kullanirsak, tum sartlari kontrol eder sonra sonucu belirler
        bu calisma usulunden dolayi tek and(&) operatöru && operatörune göre daha yavas olabilir.
        kodlamada amacimiz basit ve karsi tarafin anlayabilecegi kod yazmaktir.
         */
    }
}
