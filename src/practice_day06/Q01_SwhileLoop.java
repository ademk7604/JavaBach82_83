package practice_day06;

import java.util.Scanner;

public class Q01_SwhileLoop {
    public static void main(String[] args) {


        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        basamakToplama(sayi);
        System.out.println(basamakToplama(sayi));
    }

    private static int basamakToplama(int sayi) {

        int toplam=0;

        while (sayi!=0){ // 2562
            toplam +=sayi%10; // 10 na bolu,umdem 1. basamagi 2 tolama eklendi
            sayi/=10; // 2562 10 boldum 2 den kurtuldum
                        // 256 sayisi ile devam ediyorum. dongu boyle devam ediyor.
        }
        return toplam;
    }
}
