package practice_day01;

public class Q02_Println_vs_print {
    public static void main(String[] args) {
        /*
println() ve print() arasinda tek fark var;
println satir atliyor,
print ise imlecin ayni satirda kalmasini sagliyor.

 */
        System.out.println("****println****"); //ln yeni bir satira at demek
        System.out.println("Welcome");
        System.out.println("Java");
        System.out.println("Class");
        System.out.println("****print****");
        System.out.print(" Welcome");
        System.out.print(" Java");
        System.out.print(" Class");
    }
}
