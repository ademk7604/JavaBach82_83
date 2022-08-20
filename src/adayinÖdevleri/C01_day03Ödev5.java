package adayinÖdevleri;

import java.util.Scanner;

public class C01_day03Ödev5 {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz : Mehmet
        //Soyisminiz : Bulut
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Isminiz :"+isim);
        System.out.println("soyisminiz :"+soyisim);
        System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz.");

    }
}
