package recap2;

public class Q01_ForWhile4 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
Input : 6
Output: 6!=65432*1=720
         */
        int sayi=6;
        int toplam=0;
        for (int i = 1; i <7 ; i++) {
            toplam +=i*i;
        }
        System.out.println(toplam);
    }
}
