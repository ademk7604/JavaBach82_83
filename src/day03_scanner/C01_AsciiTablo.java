package day03_scanner;

public class C01_AsciiTablo {
    public static void main(String[] args) {

        //
        int sayi = 10;
        char harf = 'a'; // ASCII Table devreye giriyor a=97 sayisinda dir baktigimizda
        String str="banan";

        System.out.println(sayi+harf);  //10a degil 107 oldu. 97+10
        System.out.println(sayi*harf); //
        System.out.println(str+harf); // banana, str=strong diyebilirim:)
        System.out.println(harf +2); // 99 yazar
        System.out.println(str + sayi+ harf); //banan10a yapar. str hepsini kendine benzetti.

        /* 1-char yeniHarf= harf+2 = java da önce sagdaki islemi yapar,
                            sagda int + char görunce ascii degerini alir.
                            sonra da atama islemi yapmaya calisir char yeniHarf=99;
                            sonuc olarak sag taraf int olmus oldu.
                            bu atma java acisindan kabul edilebilir degildir.
        2- (str+harf); // banana string variable cok gucludur,
                        hangi data turu ile isleme girerse girsin diger data turunu kendine benzetir.
         */
        //   peki... konsolda verilen variable lari kullanarak 10a  görmek istersek nasil yazdirmaliyiz?
        System.out.println(""+sayi+harf); // basina bir hiclik koydugumuzda sayi=10 ama string 10 olmus olur. 10a olur.
        /*
        1- char data turu isleme girdigi degiskenin turune gore farkli davranabilir.
        eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi davranir.
        sayi+harf == sayi veriable i int oldugundan harf variable i scii tablosundan 97 degerini alir.

         */
        char deger='1';
        System.out.println(deger + harf); // '1' + 'a' 49+97=146 verir.
        char deg=1;
        System.out.println(deg); // burda string olarak 1 in karsisinda ne varsa onu verir bir sekil.


    }
}
