package practice_java.practice_day01;

import java.util.Scanner;

public class Q04_NotHesaplama {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("");
        int vize1, vize2, finalNotu;

        System.out.print("vize1 :");
        vize1= scan.nextInt();
        System.out.print("ikinci vize :");
        vize2= scan.nextInt();
        System.out.print("final notu :");
        finalNotu= scan.nextInt();
        double sonuc = ((vize1=vize2)/2)*0.3 + finalNotu*0.7;
        System.out.println("sonuc = " + sonuc);
    }
}
