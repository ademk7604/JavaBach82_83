package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // Bir önceki soruyu tek seferde kullanicidan tum bilgileri alarak yapiniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi guiriniz \naralarda enter tusuna basiniz");

        String isim = scan.nextLine(); //  \n ters slaj n alt satira devam ettirir.
        String soyisim = scan.nextLine();
        int yas = scan.nextInt();
        System.out.println("girilen bilgiler = " + isim + " " + soyisim + " " + yas);

    }
}
