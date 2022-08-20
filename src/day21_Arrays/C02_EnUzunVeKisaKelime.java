package day21_Arrays;

public class C02_EnUzunVeKisaKelime {
    public static void main(String[] args) {
        // soru 2- Verilen string bir array'de
        // en uzun ve en kisa String'leri yazdiran bir method olusturun
        String [] isimler = {"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};
        enUzunVeKisayiYazdir(isimler);
    }
    public static void enUzunVeKisayiYazdir(String[] isimler) {
        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];
        for (int i = 1; i < isimler.length ; i++) { //enUzunKelime.length()) stringin uzunlugu ldugu icin lengte() kull
            if(isimler[i].length()>= enUzunKelime.length()){ // mihrican1 olsaydi = demedigimiz icin yine hayrullah verr
                enUzunKelime=isimler[i];// yeni en uzun kelimeyi done done buluyoruz
            }
            if (isimler[i].length()<=enKisaKelime.length()){
                enKisaKelime=isimler[i]; // yeni enkisakelime  taaa en kisayi bulana kadar
            }
        }
        System.out.println("Araaydaki en uzun kelime : " + enUzunKelime);
        System.out.println("Arraydaki en kisa kelime : " + enKisaKelime);
    }
}
