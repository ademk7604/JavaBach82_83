package lambda_functional_programming.selbpractice;

import lambda_functional_programming.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class selbcalisma {
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
        System.out.println("uzunlugu12denAzmi(liste) = " + uzunlugu12denAzmi(liste));
        System.out.println("xileBaslamiyorMU(liste) = " + xileBaslamiyorMU(liste));
        System.out.println("rIleBitiyorMu(liste) = " + rIleBitiyorMu(liste));
        System.out.println("yediden100eKadardegerlerinToplami() = " + yediden100eKadardegerlerinToplami());
        System.out.println("yediden100eKadardegerlerinToplami02() = " + yediden100eKadardegerlerinToplami02());
        System.out.println("ikiden11ekadarIntegerDegerlerinToplami() = " + ikiden11ekadarIntegerDegerlerinToplami());
        System.out.println("faktoriyelHesaplama(6) = " + faktoriyelHesaplama(0));
        System.out.println("verilenIkiSayiArasindakiCiftSayilarinToplamini(3,9) = " + verilenIkiSayiArasindakiCiftSayilarinToplamini(3, 9));
        System.out.println("sayilarArasindaklerinRakamlarToplami(22,26) = " + sayilarArasindaklerinRakamlarToplami(23, 32));

    }

    public static boolean uzunlugu12denAzmi(List<String> list) {
        return list.stream().allMatch(t -> t.length() < 12);
    }

    public static boolean xileBaslamiyorMU(List<String> list) {
        return list.stream().noneMatch(t -> t.startsWith("X") && t.startsWith("x"));

    }

    public static boolean rIleBitiyorMu(List<String> list) {
        return list.stream().anyMatch(t -> t.endsWith("r") || t.endsWith("R"));
    }

    // 4. class dan devam ediyoruz
    public static int yediden100eKadardegerlerinToplami() {
        return IntStream.range(7, 101).reduce(0, Math::addExact);
    }

    public static int yediden100eKadardegerlerinToplami02() {
        return IntStream.rangeClosed(7, 100).reduce(Math::addExact).getAsInt();
    }
    public static int ikiden11ekadarIntegerDegerlerinToplami(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }
    public static int faktoriyelHesaplama(int x){
        if (x<=0){
            System.out.println("Lutfen sifirdan  buyuk sayi giriniz");
            return 0;
        }
        return  IntStream.rangeClosed(1,x).reduce(1,Math::multiplyExact);
    }
    public static int verilenIkiSayiArasindakiCiftSayilarinToplamini (int x, int y){
        if (x>y){
            return IntStream.rangeClosed(y,x).filter(Utils::ciftElemanlariSec).sum();

        }
        return IntStream.rangeClosed(x,y).filter(Utils::ciftElemanlariSec).sum();
    }
    public static int sayilarArasindaklerinRakamlarToplami(int x, int y){
        return IntStream.rangeClosed(x,y).map(Utils::rakamlarToplaminiAl).sum();
    }
    }

