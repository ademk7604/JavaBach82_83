package day55_replitSorulari;


public class Q20_Calisma {
    /*
   Soru 1:
   Bir integer array olusturunuz ve bu array deki tum sayilarin carpimini For-each loop
   kullanarak bulunuz. Sonucu ekrana yazdiriniz.

   Soru 2:

   Bir integer list olusturunuz ve bu list'deki tum sayilarin karesinin toplamini For-each
   loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
   Soru 3
   iki String array olusturunuz ve bu array'lerdeki ortak elemanlari For-each loop
   kullanarak bulunuz. Sonucu ekrana yazdiriniz.

   Ortak eleman yoksa ekrana "Ortak eleman yok" yazdiriniz
   Soru 4:
   Bir String olusturunuz, bu String'deki character'leri for-each loop kullanarak
   yazdiriniz. ipucu: split(
    */
    public static void main(String[] args) {
        int arr[] = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        int sum = 1;
        int count = 1;
        for (int each : arr) { //arrayin içindeki elemanı değiştirmiyor
            sum *= each;
        }
        System.out.println(sum);


       /* int sum1 = 1;
        System.out.println();
        int each = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+":"+i+". indextedir. "+(i+1)+". elemandir.");
        }*/
    }

}

