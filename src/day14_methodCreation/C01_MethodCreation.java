package day14_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        // input olarak verilen 4 harfli stringi
        //tersten yazdiran bir metod olusturalim.

        //static main metod uye kulup
        // void sadece yazdiracak bir sey isteedigi icn
        testenYazdir("okan");
        C02_MethodCreation.rakamlariTopla(367); //C02 clasindaki rakamlari topla metodunu cagirip istedigimi yazdi.
    }
    public static void testenYazdir(String input){
        String tersInput= input.substring(3)+
                            input.substring(2,3)+
                            input.substring(1,2)+
                            input.substring(0,1);
        System.out.println("Verilen kelimenin tersten yazilisi :" + tersInput);
    }
}

