package practice_day03;

import java.util.Scanner;

public class Q005_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz :\nisim");
        String isim = scan.next();
        System.out.println("soyisim");
        String soyisim = scan.next();

        if(isim.length()>soyisim.length()){
            System.out.println("isiminiz soyisminizden uzundur");
        } else if (isim.length()==soyisim.length()) {
            System.out.println("isiminiz soyisminizle esit uzunluktadir");
        }else{
            System.out.println("soyisminiz isminizden uzun");
        }
    }
}
