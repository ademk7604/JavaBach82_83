package day55_replitSorulari;

import java.util.Arrays;

public class Q01_ArananDegeriBulma {
    /*
              Soru 4 : Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
                Array: [12,15,43,23,56,76,78,90,77,43]
                Aranan değer:56
                Beklenen Çıktı:

     */
    public static void main(String[] args) {
        int arr[] = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        int number = 43;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+":"+i+". indexte bulunur. "+(i+1)+". elemandır.");
        /* if(arr[i]==number){
                System.out.println(i+". index. " +(i+1)+". elaman");

         */
            }
        }
    }

