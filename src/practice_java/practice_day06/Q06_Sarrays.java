package practice_java.practice_day06;

import java.util.Arrays;

public class Q06_Sarrays {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        String str="HeySiri";
        str=str.replace("Hey","Bye");
        System.out.println("str = " + str);
        String [] arr=new String[1]; // 1 elemanli bir array olusturdum
        arr[0]=str; //
        System.out.println(Arrays.toString(arr));
    }
}
