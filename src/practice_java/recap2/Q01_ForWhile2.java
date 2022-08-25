package practice_java.recap2;

public class Q01_ForWhile2 {
    public static void main(String[] args) {
      /*
      Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen)
      ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
Input :
30
40
Beklenen Cikti:
30 ve 40 icin GCD = 10

30 ve 40 icin LCM = 120
       */

        int sayi1 = 30;
        int sayi2 = 40;
        int gcd=0;
        int lcm;
        lcm = sayi1 * sayi2;
        for (int i = lcm; i > 0; i--) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                lcm = i;
            }
        }
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                gcd = i;
            }

        }
        System.out.println("lcm = " + lcm);
        System.out.println("gcd = " + gcd);
    }
}
