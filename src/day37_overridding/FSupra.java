package day37_overridding;

public class FSupra extends EToyota {
    // araba class ina gidip void yakit methodu sildigimde burasi kirmizi olur. override etmisim cunku.
    void yakit(){
        System.out.println("Supra benzin kullanir");// dolayisiyla spesifiklestirme var.. 5. da bir ok cikmis, yakit1 yaptik gitti.
        /*
        Private method'lar override edilemez.
        Eger child class' da parent class daki private method ile
        ayni signature da bir method olusturursaniz bu overridding OLMAZ.// private oldugu icin child ona karisamaz.
         */
    }

    @Override // void yadigimda otomatik teklif ediyor tikladigimda kensii olusturuyor. toyota dakini silersek arabaa ya override eder.
    void motor() {
        System.out.println("Sirali 6 silindir 2JZ motor kullanir");
        /*
        @Override notasyonu Javaya bir gorev verir. Java, bu notasyonla birbirine bagli olan iki method u surekli kontrol eder.
        Eger paret class daki overridden methodu silersenizCTE verir. ama override n. yoksa vermez.
        @Override notasyonu kullanmak mecburi degildir. olamsa da olur, Ama

        Eger Overridding method silinirse kocun CTE vermesini istersek @Override notasyonu kullanmaliyiz.
         */
    }
}
