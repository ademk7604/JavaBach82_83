package day15_overloading_forLoop;

import java.util.Scanner;

public class C09_ForLoopSoru4 {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar
        //3’un kati olan sayilari yazdirin.
        System.out.println("Lutfen yuzden kucuk bir tamsayi giriniz");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        if (sayi >= 100 && sayi <= 0) {
            System.out.println("Lutfen dogru sayiyi girinz");
            }else{
            for (int i = 1; i <sayi ; i++) {
                if(i%3==0){
                    System.out.println(i);
                }
            }
        }
    }
}
