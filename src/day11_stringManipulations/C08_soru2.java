package day11_stringManipulations;

public class C08_soru2 {
    public static void main(String[] args) {
        /*
    Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
    kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
    - Girilen kelime cumlede kullanilmamis.
    - Girilen kelime cumlede 1 kere kullanilmis.
    - Girilen kelime cumlede 1’den fazla kullanilmis.
         */

        String str = "Java mi guclu yoksa Java yi gelistirenler mi";
        String kelime = "Java";

        int kelimeIlkIndex = str.indexOf(kelime);
        int kelimeSonIndex = str.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1) { // hic yok demektir
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if (kelimeIlkIndex==kelimeSonIndex) { // sonran be sondan aramada ayni index buluyorum
            System.out.println("Girilen kelime cumlede bir kere kullanilmistir");
        }else{
                System.out.println("girilen kelime cumlede birden fazla kullanilmistir.");
            }
    }
}

