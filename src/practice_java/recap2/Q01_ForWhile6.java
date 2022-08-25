package practice_java.recap2;

public class Q01_ForWhile6 {
    public static void main(String[] args) {
        /*
        Konsolda Alfabeyi Yazdıran programi yaziniz.
OUTPUT :
a b c .. .. .. .. y z
         */
        char harf='a';
        char harf2='z';
        char temp=harf2;
        String siralam="";
        while (harf<=harf2){
            siralam=(temp+"");
            System.out.println(siralam+ " ");
            temp+=1;
        }

    }
}
