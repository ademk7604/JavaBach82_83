package day37_overridding;
public class C01_Overloading {
    public static void main(String[] args) {
/*
Bir class da ayni isimde ve ayni signuture' a  sahip iki method olmaz
Ayni class da ayni isimde birden fazla method olusturmak istersek mutlaka signuture' i degistirmeliyiz

Farkli class larda ayni isim ve signuture a sahip iki method olabilir mi? ( olabilir herkes kendi dunyasinda)
 */
    }
    void ekleme(){}
    void ekleme(int sayi){}
    void ekleme(String str){}
    void ekleme(String str, int sayi){}
    void ekleme(int sayi, String str){}
}
