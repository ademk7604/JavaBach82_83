package day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "guzeldir";
        int sayi1 = 5;
        int sayi2 = 4;

        // yukaridaki variable larin kullanarak istenen metinler
        System.out.println(str1 + " " + str2 + " " + sayi1 + sayi2);
        // string ile sayyiy tolarsam
        System.out.println(str1 + " " + str2 + " " + (sayi1 + sayi2));
        System.out.println(sayi1 + sayi2 + " " + str1);
        System.out.println("" + sayi1 + sayi2 + " " + str2); // basina ""hiclik koydugumuzda devamini string olarak okurdu.

        System.out.println(str1.concat(str2)); //JavaGuzeldir // + isareti yerine concat ile de variable lar yazdirilir
        System.out.println(str1.concat(" ").concat(str2)); //Java Guzeldir bu sekilde arada bosluk ile iki defa kull

    }
}
