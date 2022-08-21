package day27_staticKeyword;

public class C01 {
    static int sayi=10; // C01 class i diyorum buna sayi 10 kutusuna yazarim takip ederim
    int rakam=5; // instence dir obje olarak bir kutunun icnne yazarim 5 rakamini

    public static void main(String[] args) {
        /*
         class level'da iki tur variable olusturabiliriz
          static (class) variable
          instance (obje) variable
        static variable'lar tum class'tan kullanilabilirken
        instance olanlar sadece static olmayan method'larda direk  kullanilabilir
        instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.
        instance variable'lar obje variable'i oldgu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.
        static variable'lar class variable'i oldugu icin
        herhangi bir satirda static variable'in degerini bulmak icin
       CLASSIN BASINDAN itibaren kod incelenmelidir.
       //bir veriable yanlizce obje olusturularak ulasilabiliyorsa instance variable'dir.
       // static variable lara direk ulasilir, ayni zamanda obje araciligi ile de ulasilabiliyor.'

         */
        C01 obj1= new C01();

        System.out.println("obj1 in rakam degeri : "+ obj1.rakam);// class nasindan itibaren yani once main method yoksa class a git.
        System.out.println("obj1' in sayi degeri : " + obj1.sayi); // classin basindan bu satira kadar sayi ya bir deger atildimi

        obj1.rakam+=1;// obj demeden kirmizi // 5+1=6
        sayi+=1; // static oldugu icin sikinti yok // 10+1=11
        System.out.println("1 arttirdiktan sonra obj1 in rakam degeri : "+ obj1.rakam);
        System.out.println("1 arttirdiktan sonra obj1  in sayi degeri : " + obj1.sayi); //

        C01 obj2= new C01();

        System.out.println("obj2 in rakam degeri : "+ obj2.rakam);// obje olusturulduktan sonra rakama bir deger atilmismi? // 5
        System.out.println("obj2' in sayi degeri : " + obj2.sayi); // static class dan alirim . sayi varmi main den basladim sayi 11 buldum

        obj2.rakam++; // 5+1=6
        obj2.sayi++; // 11+1=12

        System.out.println("1 arttirdiktan sonra obj2 in rakam degeri : "+ obj2.rakam);// 6
        System.out.println("1 arttirdiktan sonra obj2' in sayi degeri : " + obj2.sayi); // 12
        // objeye bagli olan deger ler obje ile dogar yasar olurler
        // class a bagli olan degerler class ile dogar yasar ve olurler.
        System.out.println(C01.sayi);



    }
}
