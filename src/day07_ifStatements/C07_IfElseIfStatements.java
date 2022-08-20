package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        bir onceki soruda, kullanici negatif deger girerse uyaralim
        NOT : birden fazla if - else if birbirine baglanmissa
        son durum onemlidir
        eger else ile bitiyorsa butun ihtimaller kapsaniyor demektir
        ama else if ile bitiyorsa kapsanmayan durumlar olabilir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas = scan.nextInt();
        if (yas < 0) {
            System.out.println("Lutfen gecerli bir yas yaziniz");
        } else if (yas < 65) {
            System.out.println("emekli olamazsin, " + (65 - yas) + " yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");

            // Eger bir olay icin birden fayla durum varsa if-else-if-else.... yapisini kullaniriz.
            // Burda dikkat edecegimiz sey; eger if- else if- else zinciri else ile bitiyorsa tüm ifadeler
            //kodumuz tarafindan kapsanmistir. Else ile biten if else zincirlerinden yazilan durumlardan
            // bir tanesi(ama sadece bir tanesi) mutlaka calisir.
            // eger if else ile bitiyor kodun kapsamadigi durumlar olabilir. Bu durumda body lerden biri calisabilir
            //veya hic biri calismayabilir
        }
    }
}