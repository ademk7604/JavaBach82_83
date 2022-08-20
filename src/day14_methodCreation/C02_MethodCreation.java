package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // Verilen 3 basamakli bir sayinin
        // rakamlari toplamini yazdiran bir method olusturalim
        int input = 999;

        rakamlariTopla(input);
        C01_MethodCreation.testenYazdir("mine");
    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int temp=input; // input  hesaplamanin sonunda sifir kaldigi icin bu input u
        // yeni bir isim verdigimde asagidan yazdirabilirim.

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        System.out.println("Girdiginiz " + temp + " sayisinin rakamlar toplami : " + rakamlarToplami);



    }
}