package practice_day06;

import java.util.Scanner;

public class Q02_SwhileLoop {
    public static void main(String[] args) {
         /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        int sayi = scan.nextInt();
        int count=0;
        while(sayi>0){ // asagida sayi-- diyerek sayiyi azaltiyorum ki sonsuz donguye girmesin
            if(sayi%2==1){
                System.out.println(sayi);
                count++;
            }
            sayi--;
        }
        System.out.println("count = "+ count);


    }
}