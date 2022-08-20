package day37_overridding;

public class EToyota extends DAraba{
    //burda yakit methodu kullanip kullannmamamam araba(parent) daha spesifik bir seye gerek varmi, gerek yok
    void marka(){
        System.out.println("Markamiz Toyota");
        /*super.marka();
        Eger hem overidden hem de overridding method un calismasini istersek
        ilk satira super.marka() yazabiliriz.
         */
    }
    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullanir");
    }
}
