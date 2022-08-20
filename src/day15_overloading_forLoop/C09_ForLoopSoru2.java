package day15_overloading_forLoop;

public class C09_ForLoopSoru2 {
    public static void main(String[] args) {
        //Soru 2 ) 10 ile 30 arasindaki sayilari aralarinda virgule olarak ayni satirda yazdirin
        for (int i = 10; i <= 30; i++) {
            if (i >= 10 && i <= 29) {
                System.out.print(i + ",");
            } else if (i == 30) {
                System.out.println(i);
            }
        }
    }
}
