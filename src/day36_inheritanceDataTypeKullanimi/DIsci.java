package day36_inheritanceDataTypeKullanimi;
import day34_inheritance.Personel;
import java.util.*;
public class DIsci extends BMuhasebe {
    protected int saatUcreti=11;
    protected int gunlukMesai=7;
    protected void maasIsci(){
        System.out.println("Isciler  : " + (30*saatUcreti*gunlukMesai) + " maas alir ");
    }
    protected void ozelSigortaIsci (){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }
    public static void main(String[] args) {

        BMuhasebe isc1 =new DIsci(); // bu sekilde hata vermiyor. isci ayni zamanda muhasebe baglidir.
        /*
        iscinin muhasebedeki calisan olarak haklarini gormek istiyorum. iscinin sprsifik haklari degil.
        Bir obje olusturulurken, Data turu ve constructor ayni class dan ise, direk o class a gidiyorduk

        Eger data turu ve constructor farkli ise, (yukaridaki)
        Oncelikle (simdilik) Data turunun oldugu class a gideriz.
        ancak bizden istenen Isci class indaki Spesifik ozellikler degil. Bir iscinin muhasebe classindaki
        tum calisanlarla beaber sahip oldugu genel ozelliklerini yazdirir.
        isc1 objesini burdan muhasebe de olusturdum.
        */
        System.out.println(isc1.gunlukMesai);// 8 muhasebe den alacagiz.
        System.out.println(isc1.saatUcreti); // M 10
        isc1.maas(); //M Personel minumum : 2400
        isc1.ozelSigorta();// M Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc1.sigorta(); // P Tum personelimiz sigorta yapilir
        System.out.println(isc1.isim); // P
        System.out.println(isc1.soyisim); // P
        System.out.println(isc1.departmant);// P

        APersonel isc2=new DIsci(); // aramaya personelden baslar gunluk mesayi yok mesala geriye gidemiyor zaten. cort.

        //System.out.println(isc2.gunlukMesai);// 8 muhasebe den alacagiz.
       // System.out.println(isc2.saatUcreti); // M 10
        //isc2.ozelSigorta();// M Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc2.maas();// personda maas method unu gordu hemen yazmiyor. Acaba iscinin maasi overriding edilmismi? M=2400
        isc2.sigorta(); // P Tum personelimiz sigorta yapilir
        System.out.println(isc1.isim); // P
        System.out.println(isc1.soyisim); // P
        System.out.println(isc1.departmant);// P
           /*
         Eger Data turu olan class'da aradigimiz ozellik yoksa
         varsa onun parent'ina gidebilir
         ama child'a donus olmaz. Aradigi ozelligi bulamazsa CTE verir
         */
        List<String> list = new LinkedList<>();
        Deque<String> list2 = new LinkedList<>();
        Queue<String> list3 = new LinkedList<>();
    }
}
