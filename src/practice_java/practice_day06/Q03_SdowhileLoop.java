package practice_java.practice_day06;

import java.util.Scanner;

public class Q03_SdowhileLoop {
    public static void main(String[] args) {
          /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
        Scanner abc =new Scanner(System.in);
        String okunan="";

        do {
            System.out.println("harf giriniz : ");
            okunan = abc.next();
            System.out.println("Program calisiyor");
        }while (!okunan.equalsIgnoreCase("x")); // x e esit olmadigi surece calis
        System.out.println("program bitti");


    }
}
