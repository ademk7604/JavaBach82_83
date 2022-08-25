package practice_java.sifirdanJava;

public class C03_SwitchDemo {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : gectiniz");
                break;
            case 'B':
                System.out.println("Cok guzel : Gectiniz");
            case 'C':
                System.out.println("Iyi : Gectini");
            case 'D':
                System.out.println("Fena degil : Gectiniz");
            case 'F':
                System.out.println("Malesef Kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");

        }
    }
}
