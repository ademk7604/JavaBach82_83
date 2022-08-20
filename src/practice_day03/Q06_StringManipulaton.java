package practice_day03;

import java.util.Scanner;

public class Q06_StringManipulaton {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
        // yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("string1 :");
        String str1= scan.nextLine();

        System.out.println("string2 :");
        String str2 = scan.nextLine();
        System.out.println("1.yontem :" +str1 + " " + str2);
        System.out.println("2.yontem :" + str1.concat(" "+str2));

        String str1_oindextenSonrasi = str1.substring(1);
        String str2_oindextenSonrasi = str2.substring(1);
        System.out.println("manipulationdan sonraki hali :" + str1_oindextenSonrasi+ "" + str2_oindextenSonrasi);
        // veya asagidaki cozumum ile
        System.out.println(str1.substring(1).concat(str2.substring(1)));
    }
}
