package day32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Clam down");
        sb.replace(5,10,"Up"); // kodu secerken. dan sonra ne ile baslayip nasil devam ettigine dikkat et.
        // sonunda da StringBuilder dondurdugunu yaziyordu. ne dondurdugune de dikkat et. string deseydi sondurmezdi.
        System.out.println(sb); // Clam Up
        sb.replace(4,5,"---");
        System.out.println(sb); // Clam---Up
        sb.replace(4,7," ");
        System.out.println(sb); // Clam Up eski haline dondurduk :)
        sb.replace(5,7,"down");
        System.out.println(sb); // Clam down basa donduk :)


    }
}
