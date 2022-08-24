package lambda_functional_programming.selbpractice;

public class MethodlarimSelbst {//seed (tohum) methodlar create edildi
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
    public static int rakamlarToplaminiAl(int x){
        int  toplam =0;

        while (x>0){
            toplam += x%10;
            x /=10;
        }
        return toplam;
    }
}