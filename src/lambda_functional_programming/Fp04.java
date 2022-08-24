package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {
        System.out.println(get7den100eToplam());
        System.out.println("get7den100eToplam02() = " + get7den100eToplam02());
        System.out.println(get2den11eCarpim()); //39916800
        System.out.println(faktoriyelHesapla(0)); //120
        System.out.println(verilenIkiSayiArasindakiCiftSayilarinToplami(9, 3));
        System.out.println(ikiSayiArasindakiTumSayilarinRakamlariToplami(11, 13)); //9. 11 12 13

    }

    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.
    public static int get7den100eToplam() {
        //range aralik sayi hesaplamam icin IntStream (int larin akisini veriyor) ihtiyacim var. bu sayilari sanki bir collection mus gibi  teker teker sayilari aliyor.
        return IntStream.range(7, 101).reduce(Math::addExact).getAsInt(); //5029 getAsInt ilk deger (0) yerine kullandik
        //range belli bir alalik demektir.
        //IntStream intlarin akimi demektir.
    }

    //2.Yol
    public static int get7den100eToplam02() {
        //rangeClosed ilki ve sondaki dahil. bu sekilde funtional prog. yapiliyor.
        return IntStream.rangeClosed(7, 100).reduce(Math::addExact).getAsInt();
    }

    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.
    public static int get2den11eCarpim() {

        return IntStream.rangeClosed(2, 11).reduce(Math::multiplyExact).getAsInt();
    }

    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static int faktoriyelHesapla(int x) {
        if (x > 0) {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt(); //120 1 den basla x e kadar git
            // yukardaki return okudugunda stop olay bitmistir. if calismazsa asagida bir return calismasi gerekir bioz yazdik
        } else if(x==0){
            return 1;
        }
        System.out.println("0' dan buyuk deger giriniz");
        return 0;
    }

    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.
    public static int verilenIkiSayiArasindakiCiftSayilarinToplami(int x, int y) {
        int z = 0;
        if (x > y) {// 9, 3 giridgim icin oncce burasi calisir 3,9 za cevirip returd e donduruyoruz.
            z = x;
            x = y;
            y = z;
        }
        return IntStream.rangeClosed(x, y).filter(Utils::ciftElemanlariSec).sum(); // 3 den 9 burasi calisir
    }

    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68
    public static int ikiSayiArasindakiTumSayilarinRakamlariToplami(int x, int y) {
        // map kullaniyorum cunku sayilari degistiriyorum
        int z = 0;
        if (x > y) {
            z = x;
            x = y;
            y = z;
            //return IntStream.rangeClosed(y, x).map(Utils::rakamlarToplaminiAl).sum();

        }
        return IntStream.rangeClosed(x, y).map(Utils::rakamlarToplaminiAl).sum();
        //(Utils::rakamlarToplaminiAl) sayilari toplar elinde tutar sinra sum ile toplamak lazim.
    }
}
