package day21_Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C12_KelimeSayisiniYazdirma {
    public static void main(String[] args) {
          /*Soru=
        Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.
       */
                Scanner scan=new Scanner(System.in);
                System.out.println("Lutfen bir cumle giriniz ");
                String verilenCumle= scan.nextLine();
                int kelimeSayisi=0;


                String[]ArrayCumle=verilenCumle.split(" ");
                kelimeSayisi=ArrayCumle.length;
                System.out.println(kelimeSayisi);


            }
        }
