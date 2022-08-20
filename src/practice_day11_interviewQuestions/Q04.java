package practice_day11_interviewQuestions;

import java.util.Scanner;

public class Q04 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
//bunu kart sifre kontrol de de kullabilirinisz
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sifre="erdal.bey123";
        int girisSayisi=3;
        System.out.println(" Bir sifre giriniz");
        String str=scanner.nextLine();

        while (true){
            System.out.println("Sifre gir");
            String girilenSifre=scanner.nextLine();
            if (sifre.equals(girilenSifre)){
                System.out.println("sifren basarili");
                break;
            }else{
                System.out.println("sifren yanlis");
                girisSayisi--;
                System.out.println("kalan girins hakkin : "+girisSayisi);
            }
            if (girisSayisi == 0){
                System.out.println("giris hakki kalmadi kart bloke "+girisSayisi);
                break;
            }
        }
    }

}
