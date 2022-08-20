package day08_ifElseStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        /*
        emeklilik kontrolu yapan bir program yaziniz
        cinsiyet olarak E (erkek) veya K (kadin) degiskenlerini kabul etsin
        farkli bir harf veya sembol girilirse hata mesaji versin

        emeklilik icn kadinlarda yas siniri 60
        erkeklerde 65 olsun

        negatif yas veya 80 den buyuk yas girilirse hata mesaji versin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz" +
                "\n kadin icin K erkek icin E harfini giriniz");
        char cinsiyet= scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if (cinsiyet=='E'){
            if (yas<0 || yas>80){
                System.out.println("gecerli yas giriniz");
            } else if (yas<65){
                System.out.println("emekli olamazsin");
            } else {
                System.out.println("emekli olabilirsin");
            }
        } else if (cinsiyet=='K'){
            if (yas<0 || yas>80) {
                System.out.println("Lutfen gecerli tercih giriniz");
            } else if (yas<60){
                System.out.println("emekli olamazsain");
            } else{
                System.out.println("emekli olabilirsin");
            }
        } else{
            System.out.println("Lutfen gecerli bir tercih giriniz");
        } // uzun olmasina aldanma bazen boyle uzun olabilir.
    }
}
