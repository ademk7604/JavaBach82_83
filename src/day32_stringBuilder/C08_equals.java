package day32_stringBuilder;
public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str ="Java";
        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(sb1)); // true
        // StringBuilder da equals method u ancak ayni obje olursa true doner
        // sadece kendisine esitmi diye sorarsak olur. String deki gibi dusunmemek lazim
        System.out.println(sb1.equals(str)); // normal sartlarda iki farkli objeyi birbiri ile karsilastiramazsin
        // ama String ile StringBuilder RTE vermiyor false veriyor.
        System.out.println(sb1.compareTo(sb2)); // 0  j ile j ayni mi? ayni a ile a aynimi
        StringBuilder sb3 =new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3)); // -4 a ile e arasinda 4 karakter var -4 geride
        /* CopareTo () iki StringBuilder i bastan baslayarak harf har karsilastirir
        ilk harfler ayni ise, ikicilere gecer ve ilk farkli olan harfe kadar gider
        farkli olan iki harfin ascii kodlari arasindaki farki verir. 'a'-'e' = -4
        eger hic farkli harf yoksa sonuc olarak 0 dondurur. */
    }
}
