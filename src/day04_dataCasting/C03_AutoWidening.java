package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {
        // dar veri turundeki bir degeri, genis veri turundeki variable'a
        // otomatik olarak assign eder
        byte sayi1 = 23;
        short sayi2 = 55;
        int sayi3 = sayi1 + sayi2; // 78
        double sayi4 = sayi1 * sayi2; // 1265.0
        // sayi4 = sayi2 / sayi1;  // 53.0 / 23 = 2.391 vermez 2.0 verir veri kaybi olur java islem önceligi uygular
        // sayi2 short dur oda kusurati almaz short byte den büyük oldugundan sonucu short 2.0 verir
        sayi4 = (double) sayi2 / sayi1;// 53.0/23 = 2.391 basina double ekleyerek sayi2 i double e cevirdik, v.k olmadi
        // dikkat ediyoruz sayi2/sayi1 i parantez icine almiyoruz cunku islemi tam sayi olarak verir.
        System.out.println(sayi4);
    }
}
