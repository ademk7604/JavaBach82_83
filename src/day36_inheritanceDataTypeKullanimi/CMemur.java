package day36_inheritanceDataTypeKullanimi;
public class CMemur extends BMuhasebe{
   protected int saatUcreti=12;
    protected int gunlukMesai=9;
    protected void maas(){
        System.out.println("Memurlar  : " + (30*saatUcreti*gunlukMesai) + " maas alir ");
    }
    protected void ozelSigorta (){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }
    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);// 9
        System.out.println(mmr1.saatUcreti); // 12
        mmr1.maas(); //Memurlar  : 3240 maas alir
        mmr1.ozelSigorta();//Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta(); // personel Tum personelimiz sigorta yapilir
        System.out.println(mmr1.isim); // personel
        System.out.println(mmr1.soyisim); // personel
        System.out.println(mmr1.departmant);// personel
        BMuhasebe mhsb1 =new BMuhasebe();
          /*
          Her ne kadar memur class inin icinde olsak da olusturdugum obje muhasabe classindan
        cunku data turu ve counstructor BMuhasebe (data turu de neymis)
        String str="Murat";  aslinda her bir class bir data turudur. string.
        ArrayList<String> list = new ArrayList<String>();
        Integer sayi=20;
        // bunlar class oldugu halde ayni zamanda data turudur
        BMuhasebe mclass i da obje olusturulabilen bir class dir yani data turudur.
        BMuhasebe de data turudur. bu objenin data turudur. obje olusturdugumuz her class data turudur.
        */
        System.out.println(mhsb1.gunlukMesai);// 8 Muhasebe
        System.out.println(mhsb1.saatUcreti); // 10 Muhasebe
        mhsb1.maas(); // Muhasebe Personel minumum : 2400
        mhsb1.ozelSigorta();//Muhasebe Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta(); // personel Tum personelimiz sigorta yapilir
        System.out.println(mhsb1.isim); // personel
        System.out.println(mhsb1.soyisim); // personel
        System.out.println(mhsb1.departmant);// personel
    }
}
