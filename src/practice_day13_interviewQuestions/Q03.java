package practice_day13_interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */
    public static void main(String[] args) {
        List<Integer> fibonaccilist = new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        System.out.println("bir say i giriniz");
        int sayi=scan.nextInt();
        fibonaccilist.add(0);
        fibonaccilist.add(1);
        System.out.println("fibonaccilist = " + fibonaccilist);

        int i=1; // bu i yi while sarti olusturmak iicn kullandik
        if (sayi<=1){
            System.out.println("daha yubuk sayilar gir");
        }else{
            while (fibonaccilist.get(i)<sayi){ // fibonacci elemanlari sayidan kucuk oldugu surece
                fibonaccilist.add(fibonaccilist.get(i)+fibonaccilist.get(i-1)); // bir onceki elemani yanindaki eleman ile toplar
                i++;
            }
            System.out.println("fibonaccilist = " + fibonaccilist); // sonra 34 de vardi onu kaldirmak icin...
            int sonIndextekiEleman=fibonaccilist.size()-1;
            if (fibonaccilist.get(sonIndextekiEleman)>sayi){
                fibonaccilist.remove(sonIndextekiEleman); // son elemani kaldiriir
                System.out.println("girdigin sayi fibonaci dizisinde bulunmamaktadir" +
                        "sizin girdiginiz sayiya kadar ki fibonacci dizisi budur = " + fibonaccilist);
            }else{
                System.out.println("senin girdigin sayi fibonanci listesinde var fibonancilist = " + fibonaccilist);
            }
        }


    }
}
