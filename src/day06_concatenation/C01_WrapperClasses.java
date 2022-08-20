package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        /*
        Wrapper class javanin hazir methodlari kullanabilmemiz icin
        primitive data turlerinin herbiri icin actigi class'lardir.
        sadece int ve char wrapperclassesleri söyledir;
        int --> Integer
        char --> Character
        digerleri primitive data turu ile ayni sadece bas harfi buyuk */
        String str = "Java ile hayat ne guzel";
        System.out.println(str.toUpperCase()); // JAVA ILE HAYAT NE GUZEL
        boolean guzelMi = true;
        // guzelMi.   boolean primitive oldugundan hazir method'u bulunmuyor
        Boolean buGuzelMi = true; // wrapperClasses ini kullanmak istiyorsam veriable nin bas harfini büyük yapiyorum.
        buGuzelMi.toString(); // B yi buyuk yaptigizi bazi metodlar geliyor
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.MAX_VALUE); // 32767
        String ogrNo = "123456";
        // kullanicidan bir sifre isteyin
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");
        String sifre = scan.nextLine(); // rakam olarak istemedigim icin string olarak yadiriyorum girilen bilgiyi
        Integer sifreSayi = Integer.parseInt(sifre); //parseInt(String s) icine stringi aliyor. stringi int a dönustürdüm
        // parselInt(String in) oyelligi cok önemli. cunku veriler genellikle data base de string olarak durur.
        // Bu sekilde tamamen sayilardan olusan stringi int a cevirebiliyoruz.
        System.out.println("girilen sifrenin 3 fazlasi : " + (sifre + 3));
        System.out.println("Integer sifrenin 3 fazlasi : " + (sifreSayi + 3)); //bu matematiksel bir sayi ya döndürdük int
        /*Wrapper class'lar ilerde kullanabilecegimiz pekcok faydali hazir method icerir*/

    }
}