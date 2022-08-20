package practice_day07;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {
    public static void main(String[] args) {
        /*
        kullanicidan girdigi bir array in en buyuk elemani ile
        en kucuk elemani farkini bulan bir method vreate ediniz.
         */
        farkiniBul();
    }

    private static void farkiniBul() {

        Scanner scan=new Scanner(System.in);
        System.out.println("array uzunlugunu giriniz: ");
        int uzunluk=scan.nextInt();
        int []arr= new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("array in " + (i+1) + ". elemanini giriniz :");
            // i oldugunda 0.eleman diyecek, biz index degil eleman sorduk
            arr[i]=scan.nextInt(); // fori den gelen indexler, bu satirda kullanici tarafindan dongu bitene kadar girilen elemanlar okunur.
        }
        Arrays.sort(arr);
        System.out.println("arraydeki en buyuk eleman ile en kucuk eleman arasindaki fark : " + (arr[uzunluk-1]-arr[0]));
        // odev: bu soruyu math classi kullanarak cozunuz.
    }
}
