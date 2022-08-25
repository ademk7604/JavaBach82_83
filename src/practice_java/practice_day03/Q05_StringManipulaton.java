package practice_java.practice_day03;

import java.util.Scanner;

public class Q05_StringManipulaton {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen isiminizi ve soyisminizi giriniz :");
        String firsName= scan.nextLine(),
                lastName= scan.nextLine(); //multiple declaration

        String fullName= firsName.concat(" " + lastName).toUpperCase(); // concat ekleme
        System.out.println("fullName = " + fullName);
    }
}

