package day15_overloading_forLoop;

import java.util.Scanner;

public class C09_ForLoopSoru6 {
    public static void main(String[] args) {
        /*Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
        girilen sayiya kadar tum sayilari yazdirin. Ancak;
        - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
                - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
                - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
         */
        System.out.println("Lutfen 100 den kucuk bir tamsayi giriniz");
        Scanner scan=new Scanner(System.in);
        int sayi2=scan.nextInt();

            for (int i = 1; i <= sayi2; i++) {
                if(sayi2>100 || sayi2<=0){
                    System.out.println("Lutfen dogru sayiyi giriniz");
                }else if (i%3==0 && i%5==0){
                    System.out.print("Java Guzeldir" +"\n"); // java guzeldir den sonra alt satira gecsin \n
                }else if (i%3==0){
                    System.out.print("Java"+ " ");
                }else if(i%5==0){
                    System.out.print("Guzeldir" + " ");
                }else{
                    System.out.print(i +" ");
            }
        }

    }
}
