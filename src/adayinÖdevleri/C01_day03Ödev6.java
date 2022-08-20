package adayinÖdevleri;

import java.util.Scanner;

public class C01_day03Ödev6 {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki
        //sekilde yazdirin
        //Isim – soyisim : Mehmet Bulutluoz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Isim - soyisim :"+isim+" "+soyisim);

    }
}
