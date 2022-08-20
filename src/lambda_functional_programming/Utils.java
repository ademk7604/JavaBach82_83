package lambda_functional_programming;

public class Utils {

    public static void ayniSatirdaBosluklaYazdir(Object str) {

        System.out.print(str + " "); // ayni satirda olsun diye ln sildik
        //object kullandim cunku string diger tarafta hata veriyor
    }

    public static boolean ciftElemanlariSec(int x) {

        return x % 2 == 0; // cift elemanlar icin true dondurur.
    }

    public static boolean tekElemanlariSec(int x) {

        return x % 2 != 0; // cift elemanlar icin true dondurur.
    }

    public static int karesiniAl(int x) {

        return x * x;
    }
    public static int kupunuAl(int x) {

        return x*x*x;
    }
    public static double yarisiniAl(int x){

        return x/2.0;
    }
    public static char sonKarakteriAl(String str){

        return str.charAt(str.length()-1); //
    }
    public static char ilkKarakteriAl(String str){

        return str.charAt(0); //
    }
}