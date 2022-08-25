package practice_java.practice_day01;

import java.util.Scanner;

public class Q09_Scanner02 {
    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin
        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scan = new Scanner(System.in);
        System.out.print("isminiz :");
        String isim = scan.nextLine();

        System.out.print("memleketiniz :");
        String memleket = scan.nextLine();

        System.out.print("suanki konumunuz :");
        String konum = scan.nextLine();

        System.out.print("Lutfen yasinizi giriniz :");
        int yas = scan.nextInt();

        System.out.print("boyunuzu giriniz :");
        double boy = scan.nextDouble();

        System.out.print("yasadiginiz "+ konum + " u seviyor musunuz? true/false");
        boolean seviyorum=scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorum = " + seviyorum);
    }
}
