package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {

        int               not              =                  60                   ;
        //data türü   variable ismi   assignment sign   variable degeri    islem bitti isareti
        int not2    =     70 ;
        //variable       deger
        // java önce degeri hesaplar sonra assign islemini yapar

        // not2` yi 80 yapalim
        //int not2=90; yazdigimda java kabul etmez
        // not2="pekiyi" yapsak altini kirmizi cizer cunku yukarda int olarak belirtmistik.
        not2=90;
        // yani bir int variable olusturalim degeri ilk iki variable in ortalamasini olsun
        int ort = (not + not2)/2 ;  //not yukarda atanmisti 60+90 yapar deger 75 olur. java no2 deki en son degere bakti.
        System.out.println(ort);
        // "" icinde yazilan hersey metindir, java "" icinde gördügü herseyi o sekilde yazdirir.
        // eger bir variable nin degerini yazdirmak istiyorsaniz "" olmadan variable ismini yazmalisiniz.
        // int int=10 kabul etmez veya int for= da kabul etmez.
    }
}
