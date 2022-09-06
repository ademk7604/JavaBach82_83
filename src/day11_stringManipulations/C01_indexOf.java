package day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {
        String str = "Java ogrenmek cok guzel";
        /* Verilen bir String'de herhangi bir String veya char'in
           ilk kullanildigi index'i bize dondurur
         */
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("r")); //7
        System.out.println(str.indexOf("j")); // -1
        System.out.println();
        System.out.println();
        System.out.println(str.indexOf("mek")); // 10

        // eger istedigimiz index den sonrasini kontrol etnek istersek
        // o zaman ayni method u iki parametreli olarak kullanabiliriz

        System.out.println(str.indexOf("g", (6 + 1))); // yazilan index'den baslar
        // (fromindex:6) 6. indexten sonra 6 yi da dahil eder onun icin +1 dememiz gerekiyor ki 6. dahil etmesin sonrasina baksin.

        // yukaridaki str' de 2. ve 3. e nin indexlerini bulun
        //2. ci e'yi  bulabilmek icin 1.e'nin index'ine ihtiyacim var
        int ilkE = str.indexOf("e");
        int ikinciE = str.indexOf("e", ilkE + 1); //once aradigim index sonra dereden itibaren aramayi yamasini yaziyorum
        int ucuncuE = str.indexOf("e", ikinciE + 1);   // 3. e varmi

        // eger 2. e varsa 3.e'nin olup olmadigini
        // ve varsa index'ini yazdiriniz
        if (ikinciE == -1) { // ise                              Kontrol
            System.out.println("verilen str de 2.e yoktur");  // ediyor
        } else {                                             // 2. e varsa
            if (ucuncuE == -1) { // 3. e var sa?
                System.out.println("verilen str'de 3. e yok");
            } else {
                System.out.println("verilen str'daki 3.e nin index'i : " + ucuncuE);
            }
        }
    }
}
