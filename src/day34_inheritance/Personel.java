package day34_inheritance;

public class Personel {
    /*
    Eger parent class olacak sekilde tasarladiginiz bir clss varsa
    veya ilerde bu class i parent yapacaklar olabilir
    o zaman veriable ve method larin access modifier ini protected
     */
    // genel olmasini istiyorum
    protected int persNo;
    protected String isim="Isim belirtilmedi";
    protected String departman="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelin massi vardir");
    }

    protected void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");
    }

    protected void fazlaMesaiUcreti (){
        System.out.println("personel fazla mesai ucretini statusune gore alir");

    }


}
