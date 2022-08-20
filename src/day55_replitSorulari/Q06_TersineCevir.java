package day55_replitSorulari;

import java.util.Arrays;

public class Q06_TersineCevir {

    /*Soru 8 : Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

    Test Data:
    sentence -> "Java is fun"
    reversed *-> "fun is Java"*
*/
    public static void main(String[] args) {
        String str = "Java is fun";
        String strArr[] = str.split(" ");
        String str2 = "";
        for (int i = strArr.length - 1; i >= 0; i--) {
            str2 += strArr[i] + " ";
            System.out.print(strArr[i] + " ");
        }
        System.out.println(); // arada bosluk biraksin diye
        System.out.println(str2);
        System.out.println(Arrays.toString(strArr));
    }
}
