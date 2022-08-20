package practice_day01;

import java.util.Scanner;

public class Q07_Convertig {
    /*
    galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
    litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon

    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
    // formül
    // c = (f-32)*5/9
 */
    public static void main(String[] args) {
        int gallon = 1000;
        double litre = gallon*3.785;
        String sonuc1 = gallon + " galon degeri " + litre + "Litreye esittir";
        System.out.println(sonuc1);

        int l = 1000;
        double G = l/3.785;
        System.out.println(l + " litre degeri " + G + " gallona eittir");
        // 1000 litre degeri 264.2007926023778 gallona eittir

        Scanner scan=new Scanner(System.in);
        System.out.println("fahrenayt degerini giriniz : ");
        double fh =scan.nextDouble();
        //c = (f-32)*5/9

        System.out.println("girdiginiz fahrenayt degeri : " + fh + "karsiligi" + ((fh-32)*5/9) + "santigrat derecedir.");
    }
}
