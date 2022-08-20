package sifirdanJava;

import java.util.Scanner;

public class C01_If {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas=scan.nextInt();
        System.out.println("kilonuzu girniz");
        double kilo=scan.nextDouble();
        if (yas<18 && yas>0){
            System.out.println("kan bagiosi yapamaz");
        } else if (yas>18 || kilo<50) {
            System.out.println("kan bagiosi yapamaz");
        }else if (yas>18 || kilo>50){
            System.out.println("kan bagisi yapabilir");
        }

    }

}
