package day32_stringBuilder;

public class C05_indexof_lastIndexOf {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Pay attention please");
        System.out.println(sb.indexOf("Pay")); // ille her methodu kullanacagiz diye bir sey yok bilgilendirme olabilir // 0
        System.out.println(sb); // Pay attention please
        System.out.println(sb.indexOf("e")); // 7 tabi bazi method lar sb mizi degistirmiyor.
        System.out.println(sb.indexOf("e",10)); // 16 index eden sonrakini ver di o da 16. index
        System.out.println(sb.lastIndexOf("e"));// 19 aramayi sondan yapiyor ilk buldugu yeri isaretliyor.
        System.out.println(sb.lastIndexOf("e",10));//7 // ilk once 10 na kadar gider sonra 10 dan geriye dogru arar.


    }
}
