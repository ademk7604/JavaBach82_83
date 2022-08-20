package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
         Orn  : sayi1=10 ve sayi2=20;
         kod calistiktan sonra
         sayi1=20 ve sayi2=10
        // 1. adim kovalardan biri bosalmali (su kum ve bos) 2. daima suyu bos olana koyabilirim.
        // 3. adimda suyu eski
         */
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;
        // sayi 3 gecici kovamiz
        // adim 1 sayi 2 yi bos kovaya koyalim.
        sayi3 = sayi2; // 10  20 20 (sayi 3. 20 degerini atadim)

        // adim2-  1. sayiyi 2. sayiya atayacagiz
        sayi2 = sayi1; // 10  10  20 (sayi2 i 10 yaptim)
        //adim-3 bos kovadaki sayiyi sayi1 e atayalim.
        sayi1 = sayi3; // 20 10 20 1.sayi ile sayi 3. esitledim.
        System.out.println("swap'dan sonra sayi1 :" + sayi1); // 20 (aciklama yapmakta fayda var)
        System.out.println("swap'dan sonra sayi2 :" + sayi2); // 10
        // Strg Alt L kodu daha guzel gösterir.

    }
}
