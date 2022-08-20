package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf = 'a';
        //char yeniHarf = (harf + 1);  // kod bu durumda once sagdaki islemi yapar
        // char yeniHarf = 97 + 1  --> 98
        // char bir variable 98 olamayacagi icin Java hata verir
        char yeniHarf = (char) (harf + 1);//98in aski degeri b olarak yazdirdi. kardes 'a'nin 1 fazlasini al ama char
        // deg.olarak ver. Burasi matematiksel bir islem oldugu icin otomatik castin yapmadi ondan char yazdik.
        System.out.println(yeniHarf);
        /*
        Bazen bir variable'a olusturuldugu data turu disindan deger atanabilir
        Bunlardan bazisini Java otomatik olarak kabul eder
        Java eger bu deger atamasinda sorun olusacagini
        (data kayiplarin olabilecegi veya datanin baskalasabilecegi) gorurse
        bu durumda otomatik olarak bu atamayi kabul etmez
        sizden eger bu atamayi istiyorsaniz sorumlulugu almanizi bekler
         */
        int sayi1 = (int) 7.3; // int ekleyerek öyle algilamasini sagladim ve 7 diye okudu.
        System.out.println("sayi1 : " + sayi1); // 7
        double sayi2 = 10;
        System.out.println("sayi2 :" + sayi2); // 10.0
        int sayi3 = 'c';
        System.out.println("sayi3 : " + sayi3); //char 'c' nin karsiligi olan 99u yaz char<int oldugu icin hata vermiyor
        char harf2 = 98;
        System.out.println("harf2 : " + harf2); //b char 98 karsiligi c dir.Kendinden kucukleri buyuk olarak cevireiliyor
    }
}
