package day15_overloading_forLoop;

import java.util.Scanner;

public class C09_ForLoopSoru5 {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar
        //3’un veya 5”in kati olan sayilari yazdirin.
        System.out.println("Lutfen 100 den kucuk bir tamsayi giriniz");
        Scanner scan=new Scanner(System.in);
        int sayi1=scan.nextInt();
        if(sayi1==0){
            System.out.println("Lutfen gecerli bir tamsayi giriniz");
        }else {
            for (int i = 1; i <=sayi1 ; i++) {
                if(i%3==0 || i%5==0){
                    System.out.println(i);
                }
            }
        }
    }
}
