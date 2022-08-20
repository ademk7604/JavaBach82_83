package day12_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String isim = "suleyman";
        String soyisim= "Karanfil";
        String kartNo= "1234 4556 6584 3445";
        System.out.println(isim.substring(3)); // eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); // f ve sonrasi fil
        System.out.println(isim.substring(2,4)); //le

        // isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        //kredi kartin ilk dort rakami gorsun geriye kalan*

        String isimIlkHarf= isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar= isim.substring(1).replaceAll("\\w","*");
        String soyisimIlkHarf= soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w","*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar= " **** **** ****";
        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                soyisimIlkHarf+soyisimGeriyeKalanlar+ "\n "+
                kkIlk4+kkGeriyeKalanlar );

    }
}
