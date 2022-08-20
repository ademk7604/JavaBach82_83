package day31_timeFormatter_varargs;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {
        // verilen kac int olursa olsun toplayip sonucu yazdiran bir method olusturun
        int sayi1 = 10;
        int sayi2 =20;
        int sayi3=30;
        int sayi4 =40;
        int sayi5 =50;
        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4); // 4 elementli
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
    }
    public static void toplaYazdir(int... sayi){ // (...)varargs cesitlilik, cok degisken sayidaki argument demek

        /*
        Bu gosterim Integer variable lardan olusan bir varargs demektir.
        varargs array alt yapisini kullanir
         */
        int toplama=0;
        int sayiAdedi=sayi.length;
        for (int each: sayi) {
            toplama+=each;
        }
        System.out.println("Girilen " + sayiAdedi+" sayinin toplami : " + toplama);
    }
}
