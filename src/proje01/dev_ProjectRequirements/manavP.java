package proje01.dev_ProjectRequirements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class manavP {
  static   List<String> urunlerimiz = new ArrayList<>(Arrays.asList(" No   Ürün    Fiyat\n","===== ======= ========\n","00 Domates 2.10 TL\n","01 Patates 3.20 TL\n","02 Biber 1.50 TL\n",
          "03 Soğan 2.30 TL\n", "04 Havuç 3.10 TL\n","05 Elma 1.20 TL\n","06 Muz 1.90 TL\n","07 Çilek 6.10 TL\n", "08 Kavun 4.30 TL\n", "09 Üzüm 2.70 TL\n", "10 Limon 0.50 TL\n"));

   static List<Double> urunfiyatlari = new ArrayList<>();

   static  List<Integer> urunNo = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println(" No  Ürün    Fiyat\n" +
                " == ======= =======\n" +
                " 00 Domates 2.10 TL\n" +
                " 01 Patates 3.20 TL\n" +
                " 02 Biber   1.50 TL\n" +
                " 03 Soğan   2.30 TL\n" +
                " 04 Havuç   3.10 TL\n" +
                " 05 Elma    1.20 TL\n" +
                " 06 Muz     1.90 TL\n" +
                " 07 Çilek   6.10 TL\n" +
                " 08 Kavun   4.30 TL\n" +
                " 09 Üzüm    2.70 TL\n" +
                " 10 Limon   0.50 TL\n");
        System.out.println(urunlerimiz);
        urunekleme();

        fiyatekleme();

        urunNumarasi(urunNo);
    }

    public static void urunNumarasi(List<Integer> urunNo) {
        urunNo.add(00);
        urunNo.add(01);
        urunNo.add(02);

    }

    public static void fiyatekleme() {
        urunfiyatlari.add(2.10);
        urunfiyatlari.add(3.20);
        urunfiyatlari.add(1.50);

    }

    public static void urunekleme() {
        urunlerimiz.add("Domates");
        urunlerimiz.add("Patates");
        urunlerimiz.add("Biber");


    }

}
