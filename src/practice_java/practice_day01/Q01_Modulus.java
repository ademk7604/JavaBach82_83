package practice_java.practice_day01;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *  aa bu not githup dan eklendi
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli sayi giriniz");
        int num= scan.nextInt();
        int ilkIki=num/1000; //bolumu verir
        int sonIki=num%100; //100 e bolumunden kalani verir

        int ilkIkiTop= (ilkIki/10) + (ilkIki%10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop = (sonIki/10) + (sonIki%10);
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("sayilarin toplami :" + (ilkIkiTop + sonIkiTop));

    }
}
