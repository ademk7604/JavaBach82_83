package sifirdanJava;

import java.util.Scanner;

public class C02_If {
    public static void main(String[] args) {
        System.out.println("Lutfen x koordinatlari giriniz");
        Scanner scan= new Scanner(System.in);
        int x=scan.nextInt();
        System.out.println("Lutfen y koordinatlari giriniz");
        int y=scan.nextInt();
        if (x>0 &&  y>0) {
            System.out.println(" koordinatlariniz I. bolgededir.");
        } else if (x<0 && y>0) {
            System.out.println(" koordinatlariniz II. bolgededir.");
        } else if (x<0 && y<0) {
            System.out.println(" koordinatlariniz III. bolgededir.");
        } else if (x>0 && y<0) {
            System.out.println(" koordinatlariniz IIII. bolgededir.");
        }else System.out.println("Orjindesiniz");

    }
}
