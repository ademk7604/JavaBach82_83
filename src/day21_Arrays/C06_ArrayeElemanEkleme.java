package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {
        // C05 deki method' u kullanarak array'e eleman ekleyelim
        String[] takimlistesi = {"Suleyman", "Osman"};
        String eklenecekIsim = "Talha";
        takimlistesi = C05_ArrayeElementEkleme.elemanEkle(takimlistesi, eklenecekIsim);
        System.out.println(Arrays.toString(takimlistesi));
    }

}
