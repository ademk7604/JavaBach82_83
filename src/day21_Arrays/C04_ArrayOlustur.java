package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {
        // soru 4- Kullanicidan bir array in boyutunu
        // ve tum elementlerini alarak bir array olusturup,
        // bu array i bize donduren bir method olusturun

        String [] sayilar = arrayOlustur();
        System.out.println(Arrays.toString(sayilar));
    }
    public static String[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kac elemanli bir array olusturmami istersiniz");
        String pema = scan.nextLine();
        int uzunluk=Integer.parseInt(pema);
       // int[] olusturulan = new int[uzunluk];
        String[] arr= new String[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println(i + ". index icin sayi giriniz");
            arr[i]=scan.nextLine();
            //olusturulan[i]=scan.nextInt();
        }
        return arr;
    }
}
