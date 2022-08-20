package recap2;

import java.util.Scanner;

public class Q01_ForWhile1 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
        char ch1= 'a' ;

	String name =“John came late"
	Expected Output:
Number of a = 2
         */
        char ch1='a';
        String name ="John came late";
        int count=0;
        for (int i = 0; i <name.length() ; i++) {
            count +=count;

            if (!name.equals(ch1)){

            }else{
                System.out.println("aranana harf tekarar edilmemektedir");
            }

        }
        System.out.println(count);


    }
}
