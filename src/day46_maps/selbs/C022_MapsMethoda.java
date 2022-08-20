package day46_maps.selbs;

import java.util.List;
import java.util.Map;

public class C022_MapsMethoda {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMapem = C033_ReusableMethodLarim.mapOlustur();
        System.out.println(ogrenciMapem);
        //value lari sira numarali olarak yazdirin.
        C033_ReusableMethodLarim.tumValueSiraliYazdir(ogrenciMapem);

        // isim ve soyisimlerin birlikte olacagi bir liste olusturalim

        List<String> sinifIsimSoyisimList=C033_ReusableMethodLarim.isimSoyisimListesiDondur(ogrenciMapem);
        System.out.println("sinifIsimSoyisimList = " + sinifIsimSoyisimList);

    }
}
