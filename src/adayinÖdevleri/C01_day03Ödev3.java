package adayinÖdevleri;

import java.util.Scanner;

public class C01_day03Ödev3 {
    public static void main(String[] args) {
        //Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin 2r*pi.r*r*3.14
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cemberin yaircapini giriniz");
        double sayi=scan.nextDouble();
        System.out.println("cemberin cevresi :"+ (2*sayi*3.14));
        System.out.println("cemberin alani :"+ (sayi*sayi*3.14));
    }
}
