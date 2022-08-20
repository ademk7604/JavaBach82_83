package day09_ternary;

import java.util.Scanner;

public class C07_SwitchCaseSoru5 {
    public static void main(String[] args) {
        //Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi=scan.next().toLowerCase();
        switch (gunIsmi){
            case "pazartesi" :
                System.out.println("Hafta ici");
                break;
            case "sali" :
                System.out.println("Hafta ici");
                break;
            case "carsamba" :
                System.out.println("Hafta ici");
                break;
            case "persembe" :
                System.out.println("Hafta ici");
                break;
            case "cuma" :
                System.out.println("Hafta ici");
                break;
            case "cumartesi" :
                System.out.println("Hafta sonu");
                break;
            case "pazar" :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli gun giriniz");
        }
    }
}
